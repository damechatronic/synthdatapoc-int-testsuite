package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import util.CredentialsUtil;
import util.EmployeesUtil;
import util.GenRocketUtil;
import util.TonicAiUtil;

import java.io.IOException;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.time.Duration.ofSeconds;
import static org.junit.Assert.assertEquals;

public class StepDefs {

    WebDriver driver;
    Wait<WebDriver> wait;
    Map<String, String> store = new HashMap<>();

    /**
     * This method will use the TonicAiUtil class to execute the data generation process.
     * All settings and configurations have been set in place before using the UI.
     *
     * @throws InterruptedException
     * @throws URISyntaxException
     * @throws IOException
     */
    @Before
    public void before() throws InterruptedException, URISyntaxException, IOException {

        //WorkspaceId is the UUID of TonicAI Workspace. This can be obtained in the workspace settings.
        TonicAiUtil.runWorkspaceGeneration("5d95e8ed-8382-9f63-d675-f9b9aba38006");
        TonicAiUtil.runWorkspaceGeneration("e13c6612-0f43-0b21-a1f5-cd067e09e3a9");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new FluentWait<>(driver)
                .withTimeout(ofSeconds(10))
                .pollingEvery(ofSeconds(1))
                .ignoring(Exception.class);
    }

    @Given("User is on the landing page")
    public void userIsOnTheLandingPage() throws InterruptedException {
        driver.get("http://localhost:4200/");
        Thread.sleep(Duration.ofSeconds(10).toMillis());
    }

    @When("User enters a valid user and password")
    public void userEntersAValidUserAndPassword() throws InterruptedException {
        Map<String, String> credentials = CredentialsUtil.getValidCredentials();
        driver.findElement(By.id("user")).sendKeys(credentials.get("username"));
        driver.findElement(By.id("password")).sendKeys(credentials.get("password"));
        Thread.sleep(Duration.ofSeconds(10).toMillis());
        driver.findElement(By.id("singIn")).click();
    }

    @Then("User must be redirected to the inventory page")
    public void userMustBeRedirectedToTheInventoryPage() {
        WebElement screenTitle = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("screenTitle")));
        assertEquals("Inventory Management", screenTitle.getText());
    }


    @Given("User is on the inventory page")
    public void userIsOnTheInventoryPage() throws InterruptedException {
        userIsOnTheLandingPage();
        userEntersAValidUserAndPassword();
        userMustBeRedirectedToTheInventoryPage();
    }

    @When("user selects an item from inventory that has stock")
    public void userSelectsAnItemFromInventoryThatHasStock() throws InterruptedException {
        WebElement table = driver.findElement(By.id("inventoryData"));

        List<WebElement> headers = table.findElements(By.tagName("th"));
        String[] headerNames = new String[headers.size()];
        for (int i = 0; i < headers.size(); i++) {
            headerNames[i] = headers.get(i).getText();
        }

        List<WebElement> rows = table.findElements(By.tagName("tr"));

        List<Map<String, String>> tableData = new ArrayList<>();

        for (int i = 1; i < rows.size(); i++) {  // Skip the header row
            List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
            Map<String, String> rowData = new HashMap<>();
            for (int j = 0; j < cells.size(); j++) {
                rowData.put(headerNames[j], cells.get(j).getText());
            }
            tableData.add(rowData);
        }

        Map<String, String> rowDataWithStock = tableData.stream().filter(row -> Integer.valueOf(row.get("Stock")) > 0).findFirst().get();
        store.put("skuWithStock", rowDataWithStock.get("SKU"));
        store.put("stock", rowDataWithStock.get("Stock"));
        Thread.sleep(Duration.ofSeconds(10).toMillis());
    }

    @After
    public void after() {
        driver.quit();
    }

    @Then("user enters a valid SKU, quantity and Employee id")
    public void userEntersAValidSKUAndEmployeeId() throws InterruptedException {
        driver.findElement(By.id("skuTextBox")).sendKeys(store.get("skuWithStock"));
        driver.findElement(By.id("employeeIdTextBox")).sendKeys(EmployeesUtil.getSalesEmployee().toString());
        driver.findElement(By.id("quantityTextBox")).sendKeys("1");
        Thread.sleep(Duration.ofSeconds(4).toMillis());
        driver.findElement(By.id("registerSaleBtn")).click();
    }

    @And("goes to sales page")
    public void goesToSalesPage() throws InterruptedException {
        driver.findElement(By.id("salesMenuBarButton")).click();
        WebElement screenTitle = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("screenTitle")));
        assertEquals("Sales Management", screenTitle.getText());
        Thread.sleep(Duration.ofSeconds(10).toMillis());
    }

    @Then("a Success message should be displayed")
    public void aSuccessMessageShouldBeDisplayed() throws InterruptedException {
        WebElement modalTitle = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("modalTitle")));
        Thread.sleep(Duration.ofSeconds(10).toMillis());
        assertEquals("Success", modalTitle.getText());
    }

    @When("User enters {string} and {string}")
    public void userEntersAnd(String user, String password) throws InterruptedException {
        driver.findElement(By.id("user")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(Duration.ofSeconds(10).toMillis());
        driver.findElement(By.id("singIn")).click();
    }

    @Then("transaction and commission has been registered on DB")
    public void transactionAndCommissionHasBeenRegisteredOnDB() {
    }
}
