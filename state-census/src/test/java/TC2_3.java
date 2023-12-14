import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TC2_3 {
    //sad test
    @Test
    void testLoadStateCodeDataWithIncorrectFileType() {
        StateCensusAnalyser analyser = new StateCensusAnalyser("C:\\Users\\KIIT\\Desktop\\github_repos\\Indian-State-Census-Analyzer-Problem\\state-census\\StateCensus.txt");
        assertDoesNotThrow(() -> analyser.loadStateCodeDataAndVerifyCount(29),
                "Should throw StateCensusAnalyserException for incorrect file type");
    }
}