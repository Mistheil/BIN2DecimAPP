import java.util.*;
public class DecHexDefine {
public static Scanner input = new Scanner(System.in);
public static int bener, dec, i;
public static String hasil;

  public void Decimal_Hex() {
  System.out.println("Masukkan nilai desimal yang ingin diubah menjadi hexadesimal!");
  bener = 0;
  while (bener == 0) {
    System.out.println("[Masukkan nilai positif saja]");
    dec = input.nextInt();
   if (dec > 0){DecHexConvert(); bener = 1;}
   else{System.out.println("inputmu salah! Masukkan nilai desimal yang bernilai positif!");}
  }
  System.out.println("Calculating. . .\n");
  System.out.println("Nilai hexadecimalnya adalah " + hasil);
  }

  public static void DecHexConvert(){
    hasil="";
    char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
 
    while (dec > 0)
    {
      i = dec % 16;
      hasil = hex[i] + hasil;
      dec = dec /16;
    }
  }

}
