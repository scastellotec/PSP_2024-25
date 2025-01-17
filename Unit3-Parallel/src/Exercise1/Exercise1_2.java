package Exercise1;

public class Exercise1_2 {
    public static void main(String[] args) {
        new Thread(
                ()-> {
                    for(int i=0; i<5; i++)
                        System.out.println(i);
                }
        ).start();
    }
}
