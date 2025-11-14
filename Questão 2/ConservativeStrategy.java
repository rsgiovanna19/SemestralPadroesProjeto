public class ConservativeStrategy implements RiskCalculationStrategy {

    @Override
    public double calculateRiskScore(Client client) {
        return (client.getInvestments() * 0.2)
             + (client.getIncome() * 0.1)
             - (client.getAge() * 0.05);
    }
}
