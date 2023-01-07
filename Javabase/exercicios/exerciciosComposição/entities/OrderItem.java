package Javabase.exercicios.exerciciosComposição.entities;

public class OrderItem {
    private int quantity;  

    public OrderItem(int quantity) {
        this.quantity = quantity;
    }

    public double price(Product product){
        return product.getPrice() * quantity; 
    }

    @Override
    public String toString() {
        return "OrderItem [quantity=" + quantity + "]";
    }

  

}
