import java.util.Scanner;
 
public class Biner_Hexa {
 
 int num;
 
 void dptkanNilai() {
  
  System.out.println("Konversi Bilangan Biner ke Hexadecimal");
  System.out.println("===================================");
  Scanner scan = new Scanner(System.in);
  
  System.out.print("\nMasukkan Bilangan Biner :");
  num = Integer.parseInt(scan.nextLine(), 2);
 }
 
 void konversi() {
  String hexa = Integer.toHexString(num);
  System.out.println("Bilangan Hexadecimalnya adalah: " + hexa);
 }
}
 
class MainClass {
 public static void main(String args[]) {
  Biner_Hexa call = new Biner_Hexa();
  call.dptkanNilai();
  call.konversi();
 }
}