package exercises;

public class TestSandwichFilling {
    private int calories;
    private String typeOfFilling;
    final String MOTTO = "The staff of life";


    public TestSandwichFilling(int numCal, String type)
    {
        calories = numCal;
        typeOfFilling = type;
    }
    public TestSandwichFilling(int numCal)
    {
        this(numCal, "Egg salad");
    }
    public void display()
    {
        System.out.println(typeOfFilling + " filling is " + calories + " calories.");
        System.out.println(MOTTO);
    }
}
