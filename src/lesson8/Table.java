package lesson8;

public class Table {
    private  int length;
    private int wight;
    private int height;
    private String material;
    private String nameOfModel;

    public Table() {
        super();
    }

    public Table(int length, int wight, int height) {

        this.length=length;
        this.wight = wight;
        this.height = height;
    }

    public Table(int length, int wight, int height, String material, String nameOfModel) {
        this.length = length;
        this.wight = wight;
        this.height = height;
        this.material = material;
        this.nameOfModel = nameOfModel;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getNameOfModel() {
        return nameOfModel;
    }

    public void setNameOfModel(String nameOfModel) {
        this.nameOfModel = nameOfModel;
    }
}
