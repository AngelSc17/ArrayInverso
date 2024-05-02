import java.util.Scanner;
//Angel Gabriel Sanchez Cajina
//Numero de carnet: 2024-1640U
public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el tamaño del arreglo al usuario.
        int Tamaño;
        do {
            System.out.print("Ingrese el tamaño del arreglo (menor a 15 y mayor a 0): ");
            Tamaño = scanner.nextInt();
        } while (Tamaño <= 0 || Tamaño >= 15);
        
        // Crear un arreglo con el tamaño especificado anteriormente.
        int[] array = new int[Tamaño];
        
        // Llenar el arreglo usando el metodo llenado
        try {
            array = llenado(Tamaño, scanner);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }finally{
    
            scanner.close();
        }
        
        // Mostrar el arreglo inverso
        mostrar(array);
        
    }
    
    // Introduccion del metodo para llenar el arreglo con números ingresados por el usuario.
    public static int[] llenado(int Tamaño, Scanner scanner) throws Exception {
        int[] array = new int[Tamaño];
        
        System.out.println("Ingrese " + Tamaño + " números para llenar el arreglo:");
        for (int i = 0; i < Tamaño; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            try {
                array[i] = scanner.nextInt();
            } catch (Exception e) {
                throw new Exception("Entrada inválida. Por favor, ingrese un número entero.");
            }
        }
        
        scanner.close();
        
        // Invertir el orden del arreglo ingresado.
        for (int i = 0; i < Tamaño / 2; i++) {
            int temp = array[i];
            array[i] = array[Tamaño - 1 - i];
            array[Tamaño - 1 - i] = temp;
        }
        
        return array;
    }
    
    // Metodo para mostrar el arreglo.
    public static void mostrar(int[] array) {
        System.out.println("Arreglo inverso:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
