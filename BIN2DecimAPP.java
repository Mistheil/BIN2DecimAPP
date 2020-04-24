import java.util.*;

public class BIN2DecimAPP {
    public static DecBinDefine object = new DecBinDefine();
    public static BinDecDefine object2 = new BinDecDefine();
    public static DecHexDefine object3 = new DecHexDefine();
    public static HexDecDefine object4 = new HexDecDefine();
    private static Scanner input = new Scanner(System.in);
    private static int bener = 0;
    private static String pilih = "Null";
   
    public static void main(String args[]) {
        System.out.println("Aplikasi Konversi Biner,Desimal, dan hexadecimal");
        start();
        System.out.println("\nTerima kasih telah menggunakan program kami!");
        System.out.println("Dibuat oleh :\nAlle Raditya Otodinata (21120119130057)\nLiem, Christopher Jaya Mulyawan (21120119130073)");
        System.out.println("Kelompok 33\nShift 1");

    }
    public static void start(){
        System.out.println("Nilai apakah yang ingin anda ubah?");
        System.out.println("1. Binary to Decimal\n2. Decimal to Binary\n3. Decimal to Hexadecimal\n4. Hexadecimal to Decimal");
        bener = 0;
        while (bener == 0) {
              System.out.println("[Masukkan input 1-4!]");
             pilih = input.next() + input.nextLine();
             if (pilih.equals("1")){bener = 1; object2.Binary_Decimal();}
             else {
                 if (pilih.equals("2")){bener = 1; object.Decimal_Binary();}
                 else {
                     if (pilih.equals("3")){bener = 1; object3.Decimal_Hex();}
                     else{
                         if (pilih.equals("4")) {bener = 1; object4.Hex_Decimal();}
                         else {System.out.println("Inputmu salah1");}
                     }
                 }
                }

        }
        System.out.println("Ada lagi yang ingin diubah?\n1. Ya\n2. Tidak");
        bener = 0;
        while (bener ==0 ){
             System.out.println("[Masukkan input 1-2!]");
             pilih = input.next() + input.nextLine();
             if (pilih.equals("1")) { bener =1; start(); }
             else {
                 if(pilih.equals("2")){bener = 1;}
                 else {System.out.println("Inputmu salah!");}
                }

        }
    }
}
