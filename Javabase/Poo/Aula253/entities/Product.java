package Javabase.Poo.Aula253.entities;

public class Product  {
    private String name;
    private double price;

    public Product(){}
    
    public Product(String name, double price){
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static boolean staticPredicateTest(Product p){
        return p.getPrice() >=100;
    }
    public boolean nonStaticPredicateTest(){
        return price >=100;
    }
    public static void staticUpdatePrice(Product p){
        p.setPrice(p.getPrice()*1.1);
    }
    public  void nonStaticUpdatePrice(){
        price = price *1.1;
    }
   
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
    

    
}
