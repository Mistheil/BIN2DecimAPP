import java.util.*;
public class DecBinDefine {
     public static Scanner input = new Scanner(System.in);
     public static int[] binaryNum = new int[8];
     static void convert(int decimal) { 
    
        int i = 0; 
        while (decimal > 0)  
        { 
            binaryNum[i] = decimal % 2; 
            decimal = decimal / 2; 
            i++; 
        } 
        System.out.println("Nilai binernya = ");
        for (int j = i - 1; j >= 0; j--) 
            {System.out.print(binaryNum[j]);  }
    } 
}
