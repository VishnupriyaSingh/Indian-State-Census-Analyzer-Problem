import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TC1_4 {
    @Test
    void testLoadDataWithIncorrectDelimiter() {
        StateCensusAnalyser analyser = new StateCensusAnalyser("/Users/anubhavbehera/Desktop/Testing/testt/state-census/StateCensus2.txt");
        assertThrows(StateCensusAnalyserException.class, () -> analyser.loadDataAndVerifyCount(29),
                "Should throw StateCensusAnalyserException for incorrect delimiter");
    }
}
