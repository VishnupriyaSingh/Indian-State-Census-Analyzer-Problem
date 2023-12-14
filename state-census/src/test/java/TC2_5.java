import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TC2_5 {
    @Test
    void testLoadStateCodeDataWithIncorrectHeader() {
        StateCensusAnalyser analyser = new StateCensusAnalyser("path/to/incorrectHeaderStateCode3.csv");
        assertThrows(StateCensusAnalyserException.class,
                () -> analyser.loadStateCodeDataAndVerifyCount(37),
                "Should throw StateCensusAnalyserException for incorrect CSV header in state code data");
    }
}
