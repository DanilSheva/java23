package lesson111;

public class Tovar {
    private  int price;
    private String name;
    private int id;

    public Tovar() {
    }

    public Tovar(int price, String name, int id) {
        this.price = price;
        this.name = name;
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (!(o instanceof Tovar)) return false;

        Tovar tovar = (Tovar) o;

        if (this.getPrice() != tovar.getPrice())
            return false;
        if (this.getId() != tovar.getId())
            return false;
        return this.getName() != null ? this.getName().equals(tovar.getName()) : tovar.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getPrice();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + getId();
        return result;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
