public class BeerProducer implements Runnable{

    private String producerName;
    private BeerHouse house;

    public BeerProducer(String producerName, BeerHouse house) {
        this.producerName = producerName;
        this.house = house;
    }

    /**
     * Añade una cerveza siempre y cuando falte stock
     */
    public void produce() {
        while(true){
            int stock = house.getStock();
            if(stock < house.getCapacity()){
                house.addBeer();
                System.out.println("Stock anterior productor: " + stock); //eliminar esto, es para probar.
                System.out.println("El productor " + producerName + " agregó una cerveza al stock. Stock actual: " + house.getStock());
            }
        }
    }

    @Override
    public void run() {
        this.produce();
    }
}
