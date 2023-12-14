import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TC1_5 {
    @Test
    void testLoadDataWithCorrectHeader() throws StateCensusAnalyserException {
        StateCensusAnalyser analyser = new StateCensusAnalyser("/Users/anubhavbehera/Desktop/Testing/testt/state-census/StateCensus.csv");
        analyser.loadDataAndVerifyCount(37);
    }

    @Test
    void testLoadDataWithIncorrectHeader() {
        StateCensusAnalyser analyser = new StateCensusAnalyser("/Users/anubhavbehera/Desktop/Testing/testt/state-census/StateCensus3.txt");
        assertThrows(StateCensusAnalyserException.class, () -> analyser.loadDataAndVerifyCount(37),
                "Should throw StateCensusAnalyserException for incorrect CSV header");
    }
}
