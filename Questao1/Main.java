public class Main {
    public static void main(String[] args) {

        ReportCreator dailyCreator = new DailyReportCreator();
        ReportCreator weeklyCreator = new WeeklyReportCreator();

        System.out.println("Relatório Diário");
        dailyCreator.buildReport();

        System.out.println("\nRelatório Semanal");
        weeklyCreator.buildReport();

    }
}
