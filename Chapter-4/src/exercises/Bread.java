package exercises;

public class Bread {
        public static void main(String[] args){

            TestBread one = new TestBread(200);
            TestBread two = new TestBread(300, "Wheat");
            TestBread three = new TestBread(500, "Ham");

            one.display();
            two.display();
            three.display();


        }
}
