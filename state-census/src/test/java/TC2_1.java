import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TC2_1 {
    //happy test case
    @Test
    void testLoadStateCodeDataAndVerifyCount_Success() throws StateCensusAnalyserException {
        StateCensusAnalyser analyser = new StateCensusAnalyser("C:\\Users\\KIIT\\Desktop\\github_repos\\Indian-State-Census-Analyzer-Problem\\state-census\\StateCensus.csv");
        int expectedRecordCount = 37;
        assertTrue(analyser.loadStateCodeDataAndVerifyCount(expectedRecordCount));
    }

}