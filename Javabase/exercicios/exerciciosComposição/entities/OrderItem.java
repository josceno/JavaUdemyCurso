package Javabase.exercicios.exerciciosComposição.entities;

public class OrderItem {
    private int quantity; 
    private Product product;
    
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

    
    
    public OrderItem(int quantity,Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public double price(Product product){
        return product.getPrice() * quantity; 
    }

    @Override
    public String toString() {
        return product.getName()+String.format(" ,$%.2f",product.getPrice())+", Quantity: " + quantity +", "+"Subtotal: "+String.format("$%.2f",product.getPrice()*quantity);
    }

  

}
