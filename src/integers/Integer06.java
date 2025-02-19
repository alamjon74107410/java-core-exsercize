package intejers;

import java.util.Scanner;

public class Integer06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int r1=a%10;
        int r10=a/10;

        System.out.println("10 lar xomasi - "+r10);
        System.out.println("1 lar xomasi - "+r1);


    }
}