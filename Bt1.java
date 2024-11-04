
package learn;
import java.util.Scanner ;
public class Bt1 {
    public static void main (String[] args ) {
        // tinh tong cac so chan va cac so le 
        Scanner input = new Scanner (System.in) ;
        System.out.print("Nhap n : " );
        int n = input.nextInt() ;
        int sumOdd = 0 , sumEven = 0 ;
        for(int i =0 ; i < n ;i++) {
            if (i % 2 == 0 ) {
                sumEven += i ;
            }
            else {
                sumOdd += i ;
            }
        }
        System.out.println("Tong cua so chan la : " + sumEven );
        System.out.println("Tong cua so le la : " + sumOdd );
    }
}
