import java.util.*;
 
class Soru18 {
  public static void main(String[] args) {
    float sicaklik;
    Scanner scan = new Scanner(System.in);      
 
    System.out.println("Celsius sıcaklığını girin: ");
    sicaklik = scan.nextInt();
 
    sicaklik = (float) (((sicaklik * 1.8000)+32));
 
    System.out.println("Fahrenheit sıcaklığı: " + sicaklik);
  }
}
