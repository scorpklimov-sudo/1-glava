import java.util.Scanner;

public class zadacha211 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("m");
        float m = in.nextFloat();
        System.out.println("v");
        float v = in.nextFloat();
        float ro = m/v;
        System.out.println(ro);
    }
}
