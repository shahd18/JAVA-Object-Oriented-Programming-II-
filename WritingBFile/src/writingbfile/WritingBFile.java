
package writingbfile;



import java.io.*;

public class WritingBFile {
     public static void main(String[] args) throws IOException { 
       
         // An array to write to the file 
        int[] numbers = {3, 5, 7, 9, 11, 13, 15}; 
       
        // Create the binary output objects.      
        DataOutputStream d = new DataOutputStream(new FileOutputStream("Num.dat"));
                
        // complete here 
        System.out.println("Writing the numbers to the file..."); 
        
       // Write the array elements to the file. 
        for (int i = 0; i < numbers.length; i++) { 
          System.out.println("writing: "+numbers[i]); 
       
          // complete 
            d.writeInt(numbers[i]); 
        } 
        System.out.println("Done."); 
       
        // Close the file. 
        d.flush();
        d.close();
       // complete            
     }
       
}
