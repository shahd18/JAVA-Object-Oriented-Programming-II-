
package socsecprocessor;


public class SocSecException extends Exception {
    
    
    
    public SocSecException(String error){
        super(error + "Invalid social security number");
    }
}
