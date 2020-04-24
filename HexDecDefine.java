import java.util.*;
public class HexDecDefine {
public static Scanner input = new Scanner(System.in);
public static int i;
public static String hasil, hex;
public void Hex_Decimal(){
    
 System.out.println("Masukkan nilai hexadesimal yang ingin diubah ke nilai desimal");
 hex = input.next() + input.nextLine();
 System.out.println("Calculating. . .\n");
 System.out.println("Nilai desimalnya adalah " + hexToDec(hex));
}

public static int hexToDec(String hex){  
	String hstring = "0123456789ABCDEF";  
	hex = hex.toUpperCase();  
	int num = 0;  
	for (int i = 0; i < hex.length(); i++)  
	{  
		char ch = hex.charAt(i);  
		int n = hstring.indexOf(ch);  
		num = 16*num + n;  
	}  
	return num;  
   }  


}