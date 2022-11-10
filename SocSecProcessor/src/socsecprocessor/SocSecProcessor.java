
package socsecprocessor;

import java.util.Scanner;
public class SocSecProcessor {

    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        String name,ssn;
        String answer;
        char choice = 'y';
        do{
           try{
            System.out.print("Your Name? ");
                name = keyboard.nextLine();

                System.out.print("Your SSN? ");
                ssn= keyboard.nextLine();
                
                if (isValid(ssn)){
                  System.out.println(name + " With "+ ssn + " is Valid");
             }
           }
           catch (SocSecException e){
                System.out.println(e.getMessage());
            }
            System.out.print("Conitnue? ");
            answer = keyboard.nextLine();
            choice = answer.charAt(0);
        }while(Character.toUpperCase(choice)== 'Y');
        
           
        }
        
           
    // Check the SSN enterd by user 000-00-0000 in this format
    public static boolean isValid(String ssn) throws SocSecException{
           
        int index = 0;
         
        if(ssn.length()!=11){
            throw new SocSecException("wrong number of characters ");
                
            }
        for(;index < ssn.length(); index++){
            if(index == 3 || index == 6){
                if (ssn.charAt(3) != '-' || ssn.charAt(6) != '-'){
                    throw new SocSecException ("dashes at wrong positions ");
                }
            }
            else if (!Character.isDigit(ssn.charAt(index))){
                    throw new SocSecException ("contains a character that is not a digit ");
                }
            }
        return true;
         
        }
     }

