package pl.pjatk.pawmec;

public class CarModel {

    private String name;
    private int productionStartYear;
    private int productionEndYear;

    public CarModel(String name, int productionStartYear, int productionEndYear) {
        this.name = name;
        this.productionStartYear = productionStartYear;
        this.productionEndYear = productionEndYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductionStartYear() {
        return productionStartYear;
    }

    public void setProductionStartYear(int productionStartYear) {
        this.productionStartYear = productionStartYear;
    }

    public int getProductionEndYear() {
        return productionEndYear;
    }

    public void setProductionEndYear(int productionEndYear) {
        this.productionEndYear = productionEndYear;
    }

}
