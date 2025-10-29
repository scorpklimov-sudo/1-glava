import java.util.Scanner;

public class zadacha27 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Длина ребра куба ");
        int a = in.nextInt();
        double V = Math.pow(a, 3);
        double S = 6 * Math.pow(a, 2);
        System.out.println("V=" + V);
        System.out.println("S=" + S);
    }
}
