public class AggressiveStrategy implements RiskCalculationStrategy {
    @Override
    public double calculateRiskScore(Client client) {
        return (client.getInvestments() * 0.8)
             + (client.getIncome() * 0.4)
             - (client.getAge() * 0.2);
    }
}
