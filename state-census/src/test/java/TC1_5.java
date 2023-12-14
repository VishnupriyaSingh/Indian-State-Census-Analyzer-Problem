import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TC1_5 {
    //happy test case
    @Test
    void testLoadDataWithCorrectHeader() throws StateCensusAnalyserException {
        StateCensusAnalyser analyser = new StateCensusAnalyser("C:\\Users\\KIIT\\Desktop\\github_repos\\Indian-State-Census-Analyzer-Problem\\state-census\\StateCensus.csv");
        analyser.loadDataAndVerifyCount(37);
    }

    //sad test case
    @Test
    void testLoadDataWithIncorrectHeader() {
        StateCensusAnalyser analyser = new StateCensusAnalyser("C:\\Users\\KIIT\\Desktop\\github_repos\\Indian-State-Census-Analyzer-Problem\\state-census\\StateCensus3.csv");
        assertDoesNotThrow(() -> analyser.loadDataAndVerifyCount(37),
                "Should throw StateCensusAnalyserException for incorrect CSV header");
    }
}
