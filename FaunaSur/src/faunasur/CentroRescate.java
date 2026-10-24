
package faunasur;

import java.util.List;
import java.util.ArrayList;

public class CentroRescate {
    private String nombre;
    private List<Animal> animales;
    
    public CentroRescate(String nombre){
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del centro no puede ser nulo ni estar en blanco");
        }
        this.nombre = nombre;
        this.animales = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void agregarAnimal(Animal animal) throws AnimalDupException {
        if (animal == null) {
            throw new IllegalArgumentException("No se admite un animal nulo");
        }
        if (animales.contains(animal)) {
            throw new AnimalDupException("El animal");
        }
        animales.add(animal);
    }
    
    public List<Animal> obtenerAnimales() {
        return new ArrayList<>(animales);
    }
    public List<Animal> filtrarPorEstado(EstadoSalud estado) {
        if (estado == null){
            throw new IllegalArgumentException("El estado no puede ser nulo");
        }
        List<Animal> filtrados = new ArrayList<>();
        for (Animal animal : animales) {
            if (animal.getEstadoSalud() == estado){
                filtrados.add(animal);
            }
        }
        return filtrados;
    }
    
    public List<Animal> obtenerAnimalesConCostoMaximo(double maximo) {
        if (maximo <= 0){
            throw new IllegalArgumentException("El costo maximo debe ser mayor que 0");
        }
        List<Animal> resultado = new ArrayList<>();
        for (Animal animal : animales) { 
            if (animal.calcularCostoDiario() <= maximo) {
                resultado.add(animal);
            } 
        }
        return resultado;
    }
    
}
