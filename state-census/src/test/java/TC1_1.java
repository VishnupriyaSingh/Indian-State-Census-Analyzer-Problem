import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class TC1_1 {

    @Test
    void testLoadDataAndVerifyCount_Success() throws StateCensusAnalyserException {
        int expectedRecordCount = 37;
        StateCensusAnalyser analyser = new StateCensusAnalyser("/Users/anubhavbehera/Desktop/Testing/testt/state-census/StateCensus.csv");
        assertTrue(analyser.loadDataAndVerifyCount(expectedRecordCount), "The record count should match the expected count");
    }

    @Test
    void testLoadDataAndVerifyCount_Failure() throws StateCensusAnalyserException {
        int incorrectRecordCount = 30;
        StateCensusAnalyser analyser = new StateCensusAnalyser("/Users/anubhavbehera/Desktop/Testing/testt/state-census/StateCensus.csv");
        assertTrue(analyser.loadDataAndVerifyCount(incorrectRecordCount), "The record count should not match the incorrect count");
    }
}