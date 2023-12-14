import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TC2_2 {
    @Test
    void testLoadStateCodeDataWithIncorrectFile() {
        StateCensusAnalyser analyser = new StateCensusAnalyser("path/to/nonexistentStateCode.csv");
        assertThrows(StateCensusAnalyserException.class,
                () -> analyser.loadStateCodeDataAndVerifyCount(37),
                "Should throw StateCensusAnalyserException for incorrect state code file");
    }
}
