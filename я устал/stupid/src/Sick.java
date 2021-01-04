import java.util.Random;


public class Sick extends Immune {
    Random random = new Random();

    public Sick(int x, int y){
        super(x,y);
        time = 6;
    }

    public boolean W(){
        return false;
    }

    public Healthy transform(Field field){
        if (time>1){
            time--;
            infect(field);
            return this;
        }
            return new Immune(this.x, this.y);
    }

    public void infect(Field field){  //заражение соседней клетки

        if (x-1>=0 && !(field.getMas1()[x-1][y] instanceof Immune) && random.nextBoolean()){
            field.setMas2(x-1, y, new Sick(x-1,y));
            return;
        }
        if (this.x+1<field.n &&!(field.getMas1()[x+1][y] instanceof Immune) && random.nextBoolean()){
            field.setMas2(x+1, y, new Sick(x+1,y));
            return;
        }
        if (y-1>=0 && !(field.getMas1()[x][y-1] instanceof Immune) && random.nextBoolean()){
            field.setMas2(x, y-1, new Sick(x,y-1));
            return;
        }
        if (this.y+1<field.n && !(field.getMas1()[x][y+1] instanceof Immune) && random.nextBoolean()){
            field.setMas2(x, y+1, new Sick(x,y+1));
        }


    }

    public void print() {
        System.out.print("-");
    }
}
