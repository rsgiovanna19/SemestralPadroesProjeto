public class WeeklyReport implements Report {

    @Override
    public void prepare() {
        System.out.println("Dados da semana sendo coletados para preparação.");
    }

    @Override
    public void generate() {
        System.out.println("Relatório semanal sendo gerado... Formato HTML");
    }
}
