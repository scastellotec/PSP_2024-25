
public class Sumador {
    public static void main(String[] args) {
        int result = 0;
        if(args[0] == null || args[0].equals("") ||
            args[1] == null || args[1].equals("")){
            result = -1;
        }else{
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // I am waiting num1 to be smaller than num2
            if(num1>num2){
                int num3 = num1;
                num1 = num2;
                num2 = num3;
            }

            for(int i=num1; i<=num2; i++){
                result += i;
            }
        }

        System.out.println(result);
    }
}
