import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TC1_4 {
    @Test
    void testLoadDataWithIncorrectDelimiter() {
        StateCensusAnalyser analyser = new StateCensusAnalyser("C:\\Users\\KIIT\\Desktop\\github_repos\\Indian-State-Census-Analyzer-Problem\\state-census\\StateCensus2.csv");
        assertDoesNotThrow(() -> analyser.loadDataAndVerifyCount(37),
                "Should throw StateCensusAnalyserException for incorrect delimiter");
    }
}
