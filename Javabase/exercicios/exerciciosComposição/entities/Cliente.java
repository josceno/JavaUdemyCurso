package Javabase.exercicios.exerciciosComposição.entities;

import java.time.LocalDateTime;

public class Cliente {
    private String name;
    private String email;
    private LocalDateTime birthDate;
        
    
    public Cliente(String name, String email, LocalDateTime birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;

    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDateTime getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ");
        sb.append(name +" ("+ birthDate+") -"+email);

        return sb.toString();
    }
    
    
 
}
