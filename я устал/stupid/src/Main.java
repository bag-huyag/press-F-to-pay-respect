public class Main {


    public static void main(String[] args) {
        Field field = new Field();

        field.Init();

        for (int i = 0; i < 90; i++) {
            System.out.println("time: " + i);
            field.display();
            field.update();
        }
    }
}
