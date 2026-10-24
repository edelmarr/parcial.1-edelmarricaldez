
package faunasur;


public class Ave extends Animal implements IRehabilitable, ILiberable {
    private double envergaduraAlar;
    
    public Ave(String codigo, String nombre, EstadoSalud estadoSalud, double envergaduraAlar) {
        super(codigo, nombre, estadoSalud);
        if (envergaduraAlar <= 0){
            throw new IllegalArgumentException("La envergadura alar debe ser estricatamente positiva");
        }
        this.envergaduraAlar = envergaduraAlar;
    }
    
    public double getEnvergaduraAlar() {
        return envergaduraAlar;
    }
    
    @Override
    public double calcularCostoDiario(){
        return envergaduraAlar * 2;
    }
    @Override
    public String rehabilitar(){
        return "Rehabilitando al ave " + getNombre() + " (codigo: " + getCodigo() + ")";
    }
    @Override
    public String toString() {
        return "Ave " + super.toString() + " - Envergadura: " + envergaduraAlar + " cm";
    }

    @Override
    public String liberarse() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
