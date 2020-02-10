package gameZone;

public class Die {
    public static void main(String[] args)
    {
        final int HIGHEST_DIE_VALUE = 6;
        final int LOWEST_DIE_VALUE = 1;
        int randomValue;
        int randomValueTwo;
        GetSetDie dieOne = new GetSetDie();
        GetSetDie dieTwo = new GetSetDie();

        System.out.println("Two dice are rolled...");
        randomValue = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
        randomValueTwo = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
        dieOne.setDie(randomValue);
        dieTwo.setDie(randomValueTwo);

        System.out.println("Die one is " + dieOne.getDie());
        System.out.println("Die two is " + dieTwo.getDie());

    }
}
