package youDoIt;

public class CarInsurancePolicy
{
    private int policyNumber;
    private int numPayments;
    private String residentCity;

    public CarInsurancePolicy(int num, int payment, String city)
    {
        policyNumber = num;
        numPayments = payment;
        residentCity = city;

    }
    public CarInsurancePolicy(int num, int payments)
    {
//        policyNumber = num;
//        numPayments = payments;
//        residentCity = "Mayfield";
        this (num, payments, "Mayfield");
    }
    public CarInsurancePolicy(int num)
    {
//        policyNumber = num;
//        numPayments = 2;
//        residentCity = "Mayfield";
        this(num, 2, "Mayfield");
    }
    public void display()
    {
    System.out.println("Policy #" + policyNumber + ". " + numPayments + " payments annually." +
    " Driver resides in " + residentCity + ".");
    }
}
