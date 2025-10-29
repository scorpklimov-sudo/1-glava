import java.util.Scanner;

public class zadacha29 {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        System.out.println("x");
        int x = in.nextInt();
        System.out.println("y");
        int y = in.nextInt();
        System.out.println("a");
        int a = in.nextInt();
        System.out.println("b");
        int b = in.nextInt();
        double z = 2 * Math.pow(x, 3) - 3.44 * x * y + 2.3 * Math.pow(x, 2) + 7.1 * y + 2;
        double c = 3.14 + Math.pow((a + b), 3) + 2.75 * Math.pow(b, 2) - 12.7 * a - 4.1;
        System.out.println(z);
        System.out.println(c);
    }
}
