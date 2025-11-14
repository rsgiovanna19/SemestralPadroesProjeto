public abstract class ReportCreator {

    // Factory Method sendo aplicado aqui neste ponto
    public abstract Report createReport();

    //padrão para criação de relatório
    public void buildReport() {
        Report report = createReport();
        report.prepare();
        report.generate();
    }
}
