
/*
 ***********
 *********
 *******
 *****
 ***
 *
 */
import java.util.*;
public class Pattern8 {
public static void main(String[]args){
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();

    for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++ ){
            System.out.print(" ");
        }
        for(int k=1;k<=i*2-1;k++){
            System.out.print("*");
        }
        System.out.println();
    }

}
}
