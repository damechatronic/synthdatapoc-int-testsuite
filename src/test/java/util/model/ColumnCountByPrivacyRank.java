
package util.model;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class ColumnCountByPrivacyRank {

    @SerializedName("Five")
    private Long five;
    @SerializedName("Four")
    private Long four;
    @SerializedName("One")
    private Long one;
    @SerializedName("Six")
    private Long six;
    @SerializedName("Three")
    private Long three;
    @SerializedName("Two")
    private Long two;

    public Long getFive() {
        return five;
    }

    public void setFive(Long five) {
        this.five = five;
    }

    public Long getFour() {
        return four;
    }

    public void setFour(Long four) {
        this.four = four;
    }

    public Long getOne() {
        return one;
    }

    public void setOne(Long one) {
        this.one = one;
    }

    public Long getSix() {
        return six;
    }

    public void setSix(Long six) {
        this.six = six;
    }

    public Long getThree() {
        return three;
    }

    public void setThree(Long three) {
        this.three = three;
    }

    public Long getTwo() {
        return two;
    }

    public void setTwo(Long two) {
        this.two = two;
    }

}
