import java.util.Scanner;

public class zadacha22 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("nomer");
        float a = in.nextFloat();
        double y = (Math.pow(a, 2) + 10)/Math.sqrt(Math.pow(a, 2) + 1);
        System.out.println(y);
    }
}
