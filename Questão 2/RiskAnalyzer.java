public class RiskAnalyzer {

    private RiskCalculationStrategy strategy;

    public void setStrategy(RiskCalculationStrategy strategy) {
        this.strategy = strategy;
    }

    //exceção caso nao tenha decisao de estratégia ainda
    public double analyze(Client client) {
        if (strategy == null) {
            throw new IllegalStateException("A estratégia de cálculo ainda deve ser definida.");
        }
        return strategy.calculateRiskScore(client);
    }
}
