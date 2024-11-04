package learn;
import java.util.Scanner ;
public class bt2 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in) ;
        System.out.print("Nhap vao so nguyen : ");
        int n = input.nextInt() ;
        int sum = 0 ;
        while (n != 0 ) {
            int number = n % 10 ;
            sum += number ;
            n = n / 10 ;
        }
        System.out.println("Tong cac so nguyen la : " + sum );
    }
}
