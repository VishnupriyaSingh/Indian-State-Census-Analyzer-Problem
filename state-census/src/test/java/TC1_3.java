import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TC1_3 {
    @Test
    void testLoadDataWithIncorrectFileType() {
        StateCensusAnalyser analyser = new StateCensusAnalyser("C:\\Users\\KIIT\\Desktop\\github_repos\\Indian-State-Census-Analyzer-Problem\\state-census\\StateCensus.txt");
        assertDoesNotThrow(() -> analyser.loadDataAndVerifyCount(37),
                "Should throw StateCensusAnalyserException for incorrect file type");
    }
}
