
package faunasur;

import java.util.Objects;

public abstract class Animal {
    private String codigo;
    private String nombre;
    private EstadoSalud estadoSalud;
    
    public Animal(String codigo, String nombre, EstadoSalud estadosalud){
        if (codigo == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El codigo no puede ser nulo ni estar en blanco");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo ni estar en blanco");
        }
        if (estadoSalud == null) {
            throw new IllegalArgumentException("El estado de salud no puede ser nulo");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.estadoSalud = estadoSalud;
    }
    
    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public EstadoSalud getEstadoSalud(EstadoSalud estadoSalud) {
        return estadoSalud;
    }
    
    public abstract double calcularCostoDiario();
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(codigo, animal.codigo) && Objects.equals(nombre, animal.nombre);
        
        
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre);
    }
    
    @Override
    public String toString() { 
        return String.format("[%s] %s - Estado: %s", codigo, nombre, estadoSalud);
    }

    EstadoSalud getEstadoSalud() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
            
    
}
