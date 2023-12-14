import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TC1_2 {

    @Test
    void testLoadDataWithIncorrectFile() {
        StateCensusAnalyser analyser = new StateCensusAnalyser("/Users/anubhavbehera/Desktop/Testing/testt/state-census/StateCensus123.csv");
        assertThrows(StateCensusAnalyserException.class, () -> analyser.loadDataAndVerifyCount(29),
                "Should throw StateCensusAnalyserException for incorrect file");
    }
}
