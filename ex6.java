package exa;
import java.util.Scanner;

public class ex6 {
	 public static void main(String arg[])
     {
         int [] array = new int[20];
         try
         {
	         array[-3] = 24;	
         }
         catch(ArrayIndexOutOfBoundsException excepcion)
         {
	         System.out.println(" Error de índice en un array");
         }
     }

}
