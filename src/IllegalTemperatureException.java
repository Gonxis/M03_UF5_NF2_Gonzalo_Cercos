/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gonxi's
 */
public class IllegalTemperatureException extends Exception {


    public IllegalTemperatureException(String a) {
        System.out.println("No existen valores de Kº menores a 0");
    }
}
