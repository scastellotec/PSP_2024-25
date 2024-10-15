package example3;

public class HiloN implements Runnable{

    private int numBegin;
    private int numEnd;

    public HiloN(int numBegin, int numEnd) {
        this.numBegin = numBegin;
        this.numEnd = numEnd;
    }

    @Override
    public void run() {
        for(int i=numBegin; i<numEnd; i++){
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
    }
}
