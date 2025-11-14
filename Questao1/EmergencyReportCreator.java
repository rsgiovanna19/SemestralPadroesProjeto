public class EmergencyReportCreator extends ReportCreator {

    @Override
    public Report createReport() {
        return new EmergencyReport();
    }
}
