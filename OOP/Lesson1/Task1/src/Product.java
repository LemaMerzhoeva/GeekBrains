// Продукт
public class Product {


    protected String brand;
    protected String name;
    protected double price;

    public String getName() {
        return name;
    }

    public void setName(String name){
        CheckName(name);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        CheckBrand(brand);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        CheckPrice(price);
    }

    public Product(){
        this("<Product>");
    }

    public Product(String name){
        this(name, 100);
    }

    public Product(String name, double price){
        this("<Brand>", name, price);
    }

   public Product(String brand, String name, double price){
        CheckBrand(brand);
        CheckName(name);
        CheckPrice(price);
    }

    private void CheckName(String name){
        if (name == null || name.length() < 3){
            if (!this.name.equals("<Product>")){
                return;
            }
            else {
                this.name = "<Product>";
            }
        }
        else{
            this.name = name;
        }
    }

    private void CheckBrand(String brand){
        if (brand == null || brand.length() < 3){
            if (!this.brand.equals("<Product>")){
                return;
            }
            else {
                this.brand = "<Product>";
            }
        }
        else {
            this.brand = brand;
        }
    }

    public void CheckPrice(double price){
        if (price < 100){
            if (this.price > 100){
                return;
            }
            else {
                this.price = 100;
            }
        }
        else {
            this.price = price;
        }
    }

    public String displayInfo(){
        return String.format("%s - %s - %.2f", brand, name, price);
    }


}
