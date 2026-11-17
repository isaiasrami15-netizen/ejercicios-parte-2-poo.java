public class AreadelCirculo {
    
    public double radio;

    
    public AreadelCirculo(double radio) {
        this.radio = radio;
    }

    
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    
    public void mostrarArea() {
        System.out.println("El área del círculo es: " + calcularArea());
    }

    public static void main(String[] args) {
        AreadelCirculo miCirculo = new AreadelCirculo(15);

        miCirculo.mostrarArea();
    }
}
