package begins;

import java.util.Scanner;

public class Begin06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int d=scanner.nextInt();
        int b=scanner.nextInt();
        int a=scanner.nextInt();
        System.out.println("hajmi V= "+a*b*d);
        System.out.println("S= "+2*(a*b+b*d+a*d));

    }

}