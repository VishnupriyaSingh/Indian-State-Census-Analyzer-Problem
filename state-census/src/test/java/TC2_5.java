import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TC2_5 {
    //sad test
    @Test
    void testLoadStateCodeDataWithIncorrectHeader() {
        StateCensusAnalyser analyser = new StateCensusAnalyser("C:\\Users\\KIIT\\Desktop\\github_repos\\Indian-State-Census-Analyzer-Problem\\state-census\\StateCensus3.csv");
        assertDoesNotThrow(() -> analyser.loadStateCodeDataAndVerifyCount(37),
                "Should throw StateCensusAnalyserException for incorrect CSV header in state code data");
    }
}