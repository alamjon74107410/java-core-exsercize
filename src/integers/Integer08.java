package intejers;

import java.util.Scanner;

public class Integer08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int r1=a%10;
        int r10=a/10;

        System.out.println("raqamlari o'zgagan son - "+(r1*10+r10));


    }
}