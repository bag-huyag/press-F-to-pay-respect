public class Immune extends Healthy {
    int time;

    public Immune(int x, int y) {
        super(x, y);
        this.time = 4;
    }

    public Healthy transform(Field field){
        if (time>1){
            time--;
            return this;
        }
        return new Healthy(this.x, this.y); // если истекает время клетки то она становится здоровой
    }

    public boolean W() {
        return false;
    } //нет возможности заразить

    public void print(){
        System.out.print("+");
    }

}
