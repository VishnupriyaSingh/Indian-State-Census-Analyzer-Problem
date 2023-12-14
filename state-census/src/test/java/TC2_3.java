import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TC2_3 {
    @Test
    void testLoadStateCodeDataWithIncorrectFileType() {
        StateCensusAnalyser analyser = new StateCensusAnalyser("/Users/anubhavbehera/Desktop/Testing/testt/state-census/StateCensus.txt");
        assertThrows(StateCensusAnalyserException.class,
                () -> analyser.loadStateCodeDataAndVerifyCount(29),
                "Should throw StateCensusAnalyserException for incorrect file type");
    }
}
