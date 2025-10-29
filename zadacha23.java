public class zadacha23 {
    public static void main(String[] args){
        for (int a = 1; a < 1000; a++){
            double y = Math.sqrt(2*a + Math.sin(Math.abs(3*a))/3.56);
            double z = Math.sin((3.2 + Math.sqrt(1 + a))/Math.abs(5*a));
            System.out.println(a);
            System.out.println(y);
            System.out.println(z);
        }



    }
}
