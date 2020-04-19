public class BeerConsumer implements Runnable{

    private String consumerName;
    private BeerHouse house;

    public BeerConsumer(String consumerName, BeerHouse house) {
        this.consumerName = consumerName;
        this.house = house;
    }

    /**
     * Consume una cerveza siempre y cuando haya stock
     */
    public void consume() {
        while(true){
            int stock = house.getStock();
            if(stock > 0)
            {
                System.out.println("Stock anterior consumidor: " + stock); //es para probar, despues eliminar
                house.drinkBeer();
                System.out.println("El consumidor " + consumerName + " bebió una cerveza. Stock actual: " + house.getStock());
            }
        }
    }

    @Override
    public void run() {
        this.consume();
    }
}
