package exercise3;

public class operationRunnable implements Runnable{

    private int num1;
    private int num2;
    private char operation;
    private int result;

    public operationRunnable(int num1, int num2, char operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    @Override
    public void run() {
        // I should write all the operations
        if(operation=='+'){
            result = num1 + num2;
        } else{
            result = num1 * num2;
        }
    }

    public int getResult(){
        return result;
    }

}
