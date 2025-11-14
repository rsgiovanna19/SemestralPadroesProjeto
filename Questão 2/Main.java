/*Utilizado o Strategy*/

public class Main {
    public static void main(String[] args) {

        Client client = new Client("Giovanna Rosa", 200, 1000, 12);
        RiskAnalyzer analyzer = new RiskAnalyzer();

        System.out.println("Modelo Agressivo");
        analyzer.setStrategy(new AggressiveStrategy());
        System.out.println("Score: " + analyzer.analyze(client));

        System.out.println("\n Modelo Moderado");
        analyzer.setStrategy(new ModerateStrategy());
        System.out.println("Score: " + analyzer.analyze(client));

        System.out.println("\n Modelo Conservador");
        analyzer.setStrategy(new ConservativeStrategy());
        System.out.println("Score: " + analyzer.analyze(client));
    }
}
