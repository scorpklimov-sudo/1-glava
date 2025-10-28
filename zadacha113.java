import java.util.Scanner;

public class zadacha113 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("число ");
        int x = in.nextInt();
        int xplus1 = x + 1;
        int xmins1 = x - 1;
        System.out.println("Следующее за числом " + x + " число - " + xplus1 + "\nДля числа " + x + " предыдущее число - " + xmins1);
    }
}
