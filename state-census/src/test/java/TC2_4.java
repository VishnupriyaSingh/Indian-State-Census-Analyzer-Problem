import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TC2_4 {
    @Test
    void testLoadStateCodeDataWithIncorrectDelimiter() {
        StateCensusAnalyser analyser = new StateCensusAnalyser("/Users/anubhavbehera/Desktop/Testing/testt/state-census/StateCensus2.csv");
        assertThrows(StateCensusAnalyserException.class,
                () -> analyser.loadStateCodeDataAndVerifyCount(37),
                "Should throw StateCensusAnalyserException for incorrect delimiter in state code data");
    }

}
