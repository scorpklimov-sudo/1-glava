import java.util.Scanner;

public class zadacha111 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Название футбольной команды");
        String x = in.next();
        int y = 1;
        while(y>0){
            System.out.println(x + " - это чемпион");
        }
    }
}
