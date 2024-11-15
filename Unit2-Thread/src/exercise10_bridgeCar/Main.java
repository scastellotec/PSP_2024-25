package exercise10_bridgeCar;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /* En esta clase generamos la simulacion
         * No teneis que generar un simulacion completa
         * Solo me sirve para saber como invocais los hilos y los relacionais con la clase Puente
         *
         * Recordar que teneis que generar algunos coches del Norte y otros del Sur
         *
         * */

        Bridge puente = new Bridge();

        for(int i=0; i < 20; i++){
            if(i%2 == 0) {
                new Thread(new Car(puente, i, true)).start();
            } else {
                new Thread(new Car(puente, i, false)).start();
            }
            Thread.sleep(500);
        }

    }
}
