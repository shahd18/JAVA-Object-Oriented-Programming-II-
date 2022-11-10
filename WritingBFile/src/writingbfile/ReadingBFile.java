
package writingbfile;


import java.io.*;


public class ReadingBFile {
    public static void main(String[] args) throws IOException { 
        int number; // A number read from the file 
        boolean endOfFile = false; // EOF flag 
        
        // Create the binary file input objects. 
        DataInputStream d = new DataInputStream(new FileInputStream("Num.dat"));
       
        //Complete 
       // Read the contents of the file.     
       while (!endOfFile) { 
          try { // Complete 
            number = d.readInt();
            System.out.println(number+"\t");
          } 
          catch (EOFException e) { 
             endOfFile = true; 
          } 
        } 
      
       System.out.println("\nDone."); 
       
       // Close the file. 
       d.close();
       //Complete
    }
}
