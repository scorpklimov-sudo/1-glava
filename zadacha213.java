public class zadacha213 {
    public static void main(String[] args){
        for (int x = -500; x < 500; x++){
            for (int a = 1; a < 500; a++){
                for (int b = -500; b < 500; b++){
                    if (a * x + b == 0 ){
                        System.out.println(a + " " + x + " " + b);
                    }
                }
            }
        }
    }
}
