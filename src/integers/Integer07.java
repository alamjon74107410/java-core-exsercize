package intejers;

import java.util.Scanner;

public class Integer07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int r1=a%10;
        int r10=a/10;

        System.out.println("raqamlar yig'indisi - "+r10+r1);



    }
}