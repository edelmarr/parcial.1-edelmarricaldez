
package faunasur;

public class Mamifero extends Animal implements IRehabilitable {
    private double peso;
    
    public Mamifero(String codigo, String nombre, EstadoSalud estadoSalud, double peso) {
        super(codigo, nombre, estadoSalud);
        if (peso <= 0) {
        throw new IllegalArgumentException("El peso debe ser estrictamente positivo");
    }
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }
    
    @Override
    public double calcularCostoDiario() {
        return peso * 10;
    }
    
    @Override
    public String rehabilitar() {
        return "Rehabilitando al mamifero " + getNombre() + " (codigo: " + getCodigo() + ")";
    }
    
    @Override
    public String toString() {
        return "Mamifero " + super.toString() + " - Peso: " + peso + " cm";
    }
    
    
    
}
