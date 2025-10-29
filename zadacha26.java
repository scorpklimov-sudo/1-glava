import java.util.Scanner;

public class zadacha26 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Высота h");
        int R = 6350;
        int h = in.nextInt();
        double d = 2*6350 * (h/Math.sqrt(Math.pow(R, 2) + Math.pow(h, 2)));
        System.out.println(d);
    }
}
