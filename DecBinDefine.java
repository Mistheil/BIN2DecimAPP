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
     public void Decimal_Binary() {
        int bener = 0;
        while (bener == 0){
            System.out.println("Masukkan nilai biner diantara 1-255!");
            int decimal = 0;
            decimal = input.nextInt();
            if (decimal > 0 && decimal < 255) {
             bener = 1;
             System.out.println("Nilainya : " + decimal + "\n");
             System.out.println("Calculating...\n");
             convert(decimal);
             System.out.println("\n"); }
            else { System.out.println("Input yang kamu masukkan salah!"); }
        }

    }
}
