/*
ABCDE
ABCD
ABC
AB
A
 */
import java.util.*;
public class Pattern15 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}
