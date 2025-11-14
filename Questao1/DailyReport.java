public class DailyReport implements Report {

    @Override
    public void prepare() {
        System.out.println("Dados sendo preparados...");
    }

    @Override
    public void generate() {
        System.out.println("Relatório diário sendo gerado... Formato PDF");
    }
}
