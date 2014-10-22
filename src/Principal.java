
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gonchicrcos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    //Las comas, no se pueden poner puntos para el decimal --> Exception
    //El salir, has de introducir la tecla E/e para salir (preguntar sobre el resto de teclas.. case otherwase: Salir) --> Exception
    //Los K menores a 0, controlar la excepción IllegalTemperatureException y que muestre error si introduce valores por debajo de 
        //los permitidos
    public static void main(String[] args) throws IllegalTemperatureException {
        String op = "";
//        String m = "";
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        do {

            System.out.println("");
            System.out.println("Opción C/c: Pasar de Cº a Kelvin");
            System.out.println("Opción K/k: Pasar de Kelvin a Cº");
            System.out.println("Opción E/e: Salir");
            System.out.println("");
            System.out.print("Indica la opción que desea hacer: ");
            op = scanner.next();
            
//            try {
//                
//            } catch (IllegalTemperatureException e) {
//                throw new IllegalTemperatureException(m);
//            }
            
            switch (op) {
                case "k":
                case "K":

                    System.out.println("");
                    System.out.print("Introduce los grados K que quieres pasar a Cº: ");
                    double c = scanner1.nextDouble();
                    Temperature a = new Temperature(c, 'K');

                    System.out.println("");
                    System.out.println("La temperatura en K = " + a.getTempK());
                    System.out.println("La temperatura en Cº = " + (a.getTempK() - 273.15));
                    System.out.println("");


                    break;
                case "c":
                case "C":
                    System.out.println("");
                    System.out.print("Introduce los grados Cº que quieres pasar a K: ");
                    double d = scanner1.nextDouble();
                    Temperature b = new Temperature(d, 'C');

                    System.out.println("");
                    System.out.println("La temperatura en Cº = " + b.getTempC());
                    System.out.println("La temperatura en K  = " + (b.getTempC() + 273.15));
                    System.out.println("");
                    break;
                case "e":
                case "E":
                    System.out.println("");
                    System.out.println("Bye bye");
                    System.out.println("");
                    break;
            }

        } while (op.equals("E") && op.equals("e"));
    }
}
