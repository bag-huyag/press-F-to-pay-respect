public class Field {
    Healthy mas1[][];
    Healthy mas2[][];

    int n = 20;

    public Field() {
        mas1 = new Healthy[n][n];
        mas2 = new Healthy[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mas1[i][j] = new Healthy(i,j);
                mas2[i][j] = new Healthy(i,j);
            }
        }
    }

    void Init() {
        mas1[5][7] = new Sick(5, 7);
        mas1[12][15] = new Sick(12, 15);
        mas1[3][17] = new Sick(3, 17);
    }

    public void update(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                  mas2[i][j] = mas1[i][j].transform(this);
//                Healthy temp = mas1[i][j].transform(this);
//                if (!(mas2[i][j].getClass() == Immune.class && temp.getClass() == Sick.class) // имунная не может перейти в больную?
//                &&  !(mas2[i][j].getClass() == Sick.class && temp.getClass() == Healthy.class) // больная не может перейти в здоровую
//                &&  !(mas2[i][j].getClass() == Healthy.class && temp.getClass() == Immune.class)){ // здоровая не может перейти в имунную?
//                    mas2[i][j] = temp;
//                }
            }
        }
        Healthy[][] newmas;         //обменять местами mas1 и mas2
        newmas = mas1;
        mas1 = mas2;
        mas2 = newmas;
    }

    public Healthy[][] getMas1() {
        return mas1;
    }


    public void setMas2(int x, int y, Healthy healthy) {
        this.mas2[x][y] = healthy;
    }


    public void display(){
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                mas1[i][j].print();
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
