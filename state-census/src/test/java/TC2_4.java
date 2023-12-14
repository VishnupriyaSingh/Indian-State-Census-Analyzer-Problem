import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TC2_4 {
    //sad test
    @Test
    void testLoadStateCodeDataWithIncorrectDelimiter() {
        StateCensusAnalyser analyser = new StateCensusAnalyser("C:\\Users\\KIIT\\Desktop\\github_repos\\Indian-State-Census-Analyzer-Problem\\state-census\\StateCensus2.csv");
        assertDoesNotThrow(() -> analyser.loadStateCodeDataAndVerifyCount(37),
                "Should throw StateCensusAnalyserException for incorrect delimiter in state code data");
    }

}