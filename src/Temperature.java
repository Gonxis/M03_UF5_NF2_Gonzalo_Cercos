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
            throw new IllegalTemperatureException ("A");
        } else{
             this.tempK = tempK;        
        }
    }

    public void setTempC(double tempC) {
        this.tempC = tempC;
    }

    public double getTempK() {
        return tempK;
    }

    public double getTempC() {
        return tempC;
    }   
}
