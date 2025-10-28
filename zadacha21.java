import java.util.Scanner;

public class zadacha21 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("nomer");
        float x = in.nextFloat();
        double y =  (17 * Math.pow(x, 2) - 6 * x + 13);
        double z = 3 * Math.pow(x, 2) + 5 * x - 21;
        System.out.println(y);
        System.out.println(z);
    }
}
