import java.util.Scanner;

public class validadordenumero {
     private int numero;

    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    public boolean validar() {
        return true; 
    }

    
    public void mostrarNumero() {
        System.out.println("El número ingresado es: " + numero);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        validadordenumero validador = new validadordenumero();
    

        System.out.print("Ingrese un número entero: ");

        if (sc.hasNextInt()) {
            int numero = sc.nextInt();

            validador.setNumero(numero);

            if (validador.validar()) {
                System.out.println("El valor ingresado es un número entero válido.");
                validador.mostrarNumero();
            }
        } else {
            System.out.println("Error: Debe ingresar un número entero.");
        }

        sc.close();
    }
}
