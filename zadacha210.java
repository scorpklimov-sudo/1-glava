import java.util.Scanner;

public class zadacha210 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("a");
        float a = in.nextFloat();
        System.out.println("b");
        float b = in.nextFloat();
        double s = (a + b)/2;
        double g = Math.sqrt(a * b);
        System.out.println(s);
        System.out.println(g);

    }
}
