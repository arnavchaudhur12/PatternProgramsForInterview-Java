/*
5
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA

 */
import java.util.*;
public class Pattern17 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print((char)(k+64));
            }
            for(int k=i-1;k>=1;k--){
                System.out.print((char)(k+64));
            }
            System.out.println();
        }
    }
}
