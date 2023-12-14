public class Main2 {
    public static void main(String[] args) {
        String censusFilePath = "C:\\Users\\KIIT\\Desktop\\github_repos\\Indian-State-Census-Analyzer-Problem\\state-census\\StateCensus.csv";
        String stateCodeFilePath = "C:\\Users\\KIIT\\Desktop\\github_repos\\Indian-State-Census-Analyzer-Problem\\state-census\\StateCensus.csv";


        int expectedCensusRecordCount = 37;
        int expectedStateCodeRecordCount = 37;


        try {
            StateCensusAnalyser censusAnalyser = new StateCensusAnalyser(censusFilePath);
            boolean isCensusCountCorrect = censusAnalyser.loadStateCodeDataAndVerifyCount(expectedCensusRecordCount);
            if (isCensusCountCorrect) {
                System.out.println("State Census Data: Record count matches.");
            } else {
                System.out.println("State Census Data: Record count does not match.");
            }
        } catch (Exception e) {
            System.out.println("Error processing State Census Data: " + e.getMessage());
        }


        try {
            StateCensusAnalyser stateCodeAnalyser = new StateCensusAnalyser(stateCodeFilePath);
            boolean isStateCodeCountCorrect = stateCodeAnalyser.loadStateCodeDataAndVerifyCount(expectedStateCodeRecordCount);
            if (isStateCodeCountCorrect) {
                System.out.println("State Code Data: Record count matches.");
            } else {
                System.out.println("State Code Data: Record count does not match.");
            }
        } catch (Exception e) {
            System.out.println("Error processing State Code Data: " + e.getMessage());
        }
    }
}
