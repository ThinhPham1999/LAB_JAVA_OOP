
package j1.s.p0052;

public class EastAsiaCountries {
    protected String countryCode;
    protected String countryName;
    protected double countryArea;

    public EastAsiaCountries() {
    }

    public EastAsiaCountries(String countryCode, String countryName, double countryArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.countryArea = countryArea;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public double getCountryArea() {
        return countryArea;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCountryArea(double countryArea) {
        this.countryArea = countryArea;
    }
    
    public void display(){
        System.out.printf("%-10s%-25s%-20f\n",this.countryCode, this.countryName
        , this.countryArea);
    }
}
