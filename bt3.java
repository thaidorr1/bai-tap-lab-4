
package learn;
import java.util.Scanner ;
public class bt3 {
    public static void main (String[] args ) {
        Scanner input = new Scanner (System.in) ;
        System.out.print("Nhap n : " );
        int n = input.nextInt() ;
        for(int i = 0 ; i < n ;i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime (int n ) {
        int cnt = 0 ;
        for(int i=0 ; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0 ) {
                ++cnt ;
                if (i != n / i ) {
                    ++cnt ;
                }
            }
        }
        if (cnt == 2 ) {
            return true ;
        }
        else {
            return false ;
        }
    }
}
