import java.util.*;
public class BinDecDefine{
    public static Scanner input = new Scanner(System.in);
    public static int bener, binmax, bener1, i = 0;
    public static double decimal, total;
    public static String pilihan = "null";
    public static int[] binary = new int[8];
    public void Binary_Decimal(){
         binreset();
         bener = 0;
         total =0;
         while (bener == 0){
             binmax = 0;
             System.out.println("Masukkan nilai binary  sesuai urut dari paling belakang!\n");
             binary[0] = input.nextInt();
             System.out.println(binary[0]);
             binary[1] = input.nextInt();
             System.out.println(Integer.toString(binary[1]) + binary[0]);
             binary[2] = input.nextInt();
             System.out.println(Integer.toString(binary[2]) + binary[1] + binary[0]);
             binary[3] = input.nextInt();
             System.out.println(Integer.toString(binary[3]) + binary[2] + binary[1] + binary[0]);
             binary[4] = input.nextInt();
             System.out.println(Integer.toString(binary[4]) + binary[3] + binary[2] + binary[1] + binary[0]);
             binary[5] = input.nextInt();
             System.out.println(Integer.toString(binary[5]) + binary[4] + binary[3] + binary[2] + binary[1] + binary[0]);
             binary[6] = input.nextInt();
             System.out.println(Integer.toString(binary[6]) + binary[5] + binary[4] + binary[3] + binary[2] + binary[1] + binary[0]);
             binary[7] = input.nextInt();
             bener1 = 0;
             for (bener1 = 0 ; bener1<8 ; bener1++ ){
                 binmax = binmax + binary[bener1];
                }
             if (binmax >(-1) && binmax < 9){
                 System.out.println("binarynya adalah " + binary[7] + binary[6] + binary[5] + binary[4] + binary[3] + binary[2] + binary[1] + binary[0]);
                 System.out.println("Apakah binary yang anda masukkan sudah benar?");
                 System.out.println("1. ya\n2. tidak");
                 pilihan = "null";
                 bener1 =0;
                 while (bener1 == 0) {
                 System.out.println("[Masukkan input 1-2]");
                 pilihan = input.next() + input.nextLine();
                 if (pilihan.equals("1")){
                     bener1 = 1;
                     bener = 1;
                     System.out.println("Calculating. . . \n");
                     convert();
                    }
                 else{
                     if(pilihan.equals("2")){bener1 = 1 ;}
                     else{System.out.println("Input yang dimasukkan salah!");}
                    }
                 }
                }
             else {System.out.println("Inputmu salah! Masukkan yang benar!");}



               

         }
    }

    public static void convert(){
        i = 1;
        while (i <= 7){
         if (binary[i] == 1){
             double urut = i;
             decimal = Math.pow(decimal + 2, urut);
             total = total + decimal;
            }
         decimal = 0;
         i= i + 1 ;
        }
        if (binary[0] == 1) {total = total +1;}
        System.out.println("Nilai desimal dari binary " + binary[7] + binary[6] + binary[5] + binary[4] + binary[3] + binary[2] + binary[1] + binary[0] + " adalah " + total + "\n");
    }



    public static void binreset(){
        bener = 0;
        for (bener = 0 ; bener <7 ; bener++){ binary[bener] = 0;}
    }
}
