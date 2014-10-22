/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gonxi's
 */
public class Temperature {
    
    public double tempK;
    public double tempC;
    
    
    public Temperature(double temp, char t) {
        switch (t){
            case 'C':
                this.tempC = temp;
                break;
            case 'K':
                this.tempK = temp;
                break;
        }
    }
    
    public void setTempK(double tempK) throws IllegalTemperatureException {
        if (tempK < 0){
            throw new IllegalTemperatureException ("No existen valores de Kº menores a 0");
        } else{
             this.tempK = tempK;
             this.tempC = tempK - 273.15;
        }
    }

    public void setTempC(double tempC) throws IllegalTemperatureException {
        if (tempC < -273.15){
            throw new IllegalTemperatureException ("No existen valores de Cº menores a -273.15");            
        } else{
        this.tempC = tempC;
        this.tempK = tempC + 273.15;
        }
    }

    public double getTempK() {
        return tempK;
    }

    public double getTempC() {
        return tempC;
    }   

    @Override
    public String toString() {
        return "Temperature{" + "kelvin=" + tempK + ", Celsius=" + tempC + '}';
    }  
}
