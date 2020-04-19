public class Main {

    public static void main(String[] args) {
        BeerHouse house = new BeerHouse();
        Thread producer = new Thread(new BeerProducer("Fede", house));
        Thread consumer = new Thread(new BeerConsumer("Pepe", house));

        producer.start();
        consumer.start();
    }
}
