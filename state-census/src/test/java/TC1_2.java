import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TC1_2 {

    @Test
    void testLoadDataWithIncorrectFile() {
        StateCensusAnalyser analyser = new StateCensusAnalyser("WrongFile.csv");
        assertDoesNotThrow(() -> analyser.loadDataAndVerifyCount(37),
                "Should throw StateCensusAnalyserException for incorrect file");
}
}
