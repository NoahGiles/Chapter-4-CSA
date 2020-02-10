package exercises;

public class TestSandwich {
    private int calories;
    private String typeOfSandwich;
    final String MOTTO = "The staff of life";


    public TestSandwich(int numCal, String type)
    {
        calories = numCal;
        typeOfSandwich = type;
    }
    public TestSandwich(int numCal)
    {
        this(numCal, "egg salad");
    }
    public void display()
    {
        System.out.println(typeOfSandwich + " sandwich is " + calories + " calories.");
        System.out.println(MOTTO);
    }
}
