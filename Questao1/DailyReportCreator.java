public class DailyReportCreator extends ReportCreator {

    @Override
    public Report createReport() {
        return new DailyReport();
    }
}
