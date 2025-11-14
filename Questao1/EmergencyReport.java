public class EmergencyReport implements Report {

    @Override
    public void prepare() {
        System.out.println("Dados emergenciais sendo preparados e coletados.");
    }

    @Override
    public void generate() {
        System.out.println("Relatório emergencial sendo gerado... Formato TXT");
    }
}
