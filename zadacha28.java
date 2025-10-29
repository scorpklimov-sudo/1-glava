import java.util.Scanner;

public class zadacha28 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("r");
        int r = in.nextInt();
        double d = 2*Math.PI*r;
        double s = Math.PI * Math.pow(r, 2);
        System.out.println(d);
        System.out.println(s);
    }
}
