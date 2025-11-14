public class ModerateStrategy implements RiskCalculationStrategy {

    @Override
    public double calculateRiskScore(Client client) {
        return (client.getInvestments() * 0.5)
             + (client.getIncome() * 0.3)
             - (client.getAge() * 0.1);
    }
}
