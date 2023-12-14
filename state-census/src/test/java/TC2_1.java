import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TC2_1 {
    @Test
    void testLoadStateCodeDataAndVerifyCount_Success() throws StateCensusAnalyserException {
        StateCensusAnalyser analyser = new StateCensusAnalyser("/Users/anubhavbehera/Desktop/Testing/testt/state-census/StateCensus.csv");
        int expectedRecordCount = 37;
        assertTrue(analyser.loadStateCodeDataAndVerifyCount(expectedRecordCount));
    }

}
