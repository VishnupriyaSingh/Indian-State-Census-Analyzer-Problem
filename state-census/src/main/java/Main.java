public class Main {
    public static void main(String[] args) {
        StateCensusAnalyser analyser = new StateCensusAnalyser("C:\\Users\\KIIT\\Desktop\\github_repos\\Indian-State-Census-Analyzer-Problem\\state-census\\StateCensus.csv");
        analyser.loadData();
        try {
            int expectedRecordCount = 37;
            boolean isCountCorrect = analyser.loadDataAndVerifyCount(expectedRecordCount);
            if (isCountCorrect) {
                System.out.println("Record count matches.");
            } else {
                System.out.println("Record count does not match.");
            }
        } catch (StateCensusAnalyserException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}