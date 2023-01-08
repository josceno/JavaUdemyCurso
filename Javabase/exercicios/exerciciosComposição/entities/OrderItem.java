package Javabase.exercicios.exerciciosComposição.entities;

public class OrderItem {
    private int quantity;  
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    private Product product;
    
    public OrderItem(int quantity,Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public double price(Product product){
        return product.getPrice() * quantity; 
    }

    @Override
    public String toString() {
        return "OrderItem [quantity" + quantity +" "+product.getName()+" "+product.getPrice()*quantity;
    }

  

}
