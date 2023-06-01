public class Main {
    public static void main(String[] args) {
        ghost petya = new ghost("petya", 20, 20);
        wisard vasya = new wisard("vasya", 20, 20);

        while (petya.getHealth() > 0 && vasya.getHealth() > 0) {
            petya.uron(vasya.getDamage());
            petya.print();
            vasya.uron(petya.getDamage());
            vasya.print();
        }
    }
}