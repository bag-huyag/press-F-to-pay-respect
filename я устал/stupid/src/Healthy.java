public class Healthy { //здоровая клетка

    int x;
    int y;

    public Healthy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Healthy transform(Field field) { // чем клетка может стать с истеченеием времени
        return this;
    }

    public boolean W() { //метод КТО ((W)HO?)
        return true;
    } // возможность заразить

    public void print() {
        System.out.print("0");
    }
}
