
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gonxi's
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    //Las comas, no se pueden poner puntos para el decimal --> Exception
    
    public static void main(String[] args) throws IllegalTemperatureException {
        String op = "";
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        do {

            System.out.println("");
            System.out.println("Opción C/c: Pasar de Cº a Kelvin");
            System.out.println("Opción K/k: Pasar de Kelvin a Cº");
            System.out.println("Opción E/e: Salir");
            System.out.println("");
            System.out.print("Indica la opción que desea hacer: ");

            try {
                op = scanner.next();
            } catch (NoSuchElementException e) {
                System.out.println("");
                System.out.println("Valor de caracter no reconocido. Se necesita una C, una K ó una E");
            } 
            
            switch (op.toUpperCase()) {
                case "K":
                    try {
                        System.out.println("");
                        System.out.print("Introduce los grados K que quieres pasar a Cº: ");
                        double c = scanner1.nextDouble();
                        Temperature temperatura = new Temperature(c, 'K');
                        temperatura.setTempK(c);
                        System.out.println("");
                        System.out.println(temperatura.toString());                                          
                        
                    } catch (InputMismatchException e){
                        System.out.println("");
                        System.out.println("Valor numérico no válido "); 
                        System.out.println("");
                    } catch (IllegalTemperatureException e) {
                        System.out.println("");
                        System.out.println(e.getMessage());
                    }
                    
                    break;

                case "C":
                    
                    try {
                        System.out.println("");
                        System.out.print("Introduce los grados Cº que quieres pasar a K: ");
                        double cel = scanner1.nextDouble();
                        Temperature temperatura1 = new Temperature(cel, 'C');
                        temperatura1.setTempC(cel);
                        System.out.println("");
                        System.out.println(temperatura1.toString());
                    } catch(InputMismatchException e){
                        System.out.println("");
                        System.out.println("Valor numérico no válido");
                        System.out.println("");
                    } catch (IllegalTemperatureException e) {
                        System.out.println(e.getMessage());
                    }                    
                    break;

                case "E":
                    System.out.println("");
                    System.out.println("Bye bye");
                    System.out.println("");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Error al introducir opción, se necesita letra C, K ó E");
                    break;
            }

        } while (!op.equalsIgnoreCase("E"));
    }
}
