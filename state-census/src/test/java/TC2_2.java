import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TC2_2 {
    //sad case
    @Test
    void testLoadStateCodeDataWithIncorrectFile() {
        StateCensusAnalyser analyser = new StateCensusAnalyser("WorngFile.csv");
        assertDoesNotThrow(() -> analyser.loadStateCodeDataAndVerifyCount(37),
                "Should throw StateCensusAnalyserException for incorrect state code file");
    }
}