package exercises;

public class SandwichFilling
{
        public static void main(String[] args) {

            TestSandwichFilling one = new TestSandwichFilling(200);
            TestSandwichFilling two = new TestSandwichFilling(300, "Egg salad");
            TestSandwichFilling three = new TestSandwichFilling(500, "Peanut butter");

            one.display();
            two.display();
            three.display();
        }
}
