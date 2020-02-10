package exercises;

public class Sandwich {
    public static void main(String[] args) {

        TestSandwich one = new TestSandwich(600);
        TestSandwich two = new TestSandwich(900, "Egg salad");
        TestSandwich three = new TestSandwich(1500, "Peanut butter");

        one.display();
        two.display();
        three.display();
    }

}
