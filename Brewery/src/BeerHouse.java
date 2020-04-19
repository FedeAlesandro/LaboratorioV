public class BeerHouse{

    private int capacity;
    private int stock;
    private boolean available;

    public BeerHouse() {
        this.capacity = 100;
        this.stock = 0;
        this.available = false; //empieza en false porque no hay cerveza
    }

    public int getCapacity() {
        return capacity;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // No paro el sistema cuando el stock sea cero porque nomas tengo 1 y 0 de stock todo el tiempo
    public synchronized void addBeer() {
        //while(stock==capacity){
        while(available){  // mientras haya cerveza que espere (available true)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        setStock(stock+1);
        available = true;
        notifyAll();
     }

    // No paro el sistema cuando el stock sea cero porque nomas tengo 1 y 0 de stock todo el tiempo
    public synchronized void drinkBeer() {
        //while(stock>0){
        while(!available){  //mientras no haya cerveza para consumir que espere
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        setStock(stock-1);
        available = false;
        notifyAll();
    }
}
