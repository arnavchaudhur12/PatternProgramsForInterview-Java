/*
6
1          1
12        21
123      321
1234    4321
12345  54321
123456654321
 */
import java.util.*;
public class Pattern12 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
int space=2*(n-1);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            space-=2;


            System.out.println();
        }
    }
}
