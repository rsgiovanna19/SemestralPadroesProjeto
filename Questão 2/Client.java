public class Client {

    private String name;
    private double income;
    private double investments;
    private int age;

    public Client(String name, double income, double investments, int age) {
        this.name = name;
        this.income = income;
        this.investments = investments;
        this.age = age;
    }

    public String getName() { return name; }
    public double getIncome() { return income; }
    public double getInvestments() { return investments; }
    public int getAge() { return age; }
}
