package exercises;

public class TestBread {

    private int calories;
    private String typeOfBread;
    final String MOTTO = "The staff of life";


    public TestBread(int numCal, String type)
    {
      calories = numCal;
      typeOfBread = type;
    }
    public TestBread(int numCal)
    {
        this(numCal, "Wheat");
    }
    public void display()
    {
        System.out.println(typeOfBread + " bread is " + calories + " calories.");
        System.out.println(MOTTO);
    }
}
