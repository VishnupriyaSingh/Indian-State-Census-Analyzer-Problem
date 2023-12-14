import java.io.IOException;
import java.util.Iterator;

public class StateCensusAnalyser {
    private CSVStateCensus csvStateCensus;
    private CSVStates csvStates;

    public StateCensusAnalyser(String filePath) {
        this.csvStateCensus = new CSVStateCensus(filePath);
        this.csvStates = new CSVStates(filePath);
    }

    public void loadData() {
        try {
            Iterator<String[]> dataIterator = csvStateCensus.loadCSVData();
            int count = 0;
            while (dataIterator.hasNext()) {
                count++;
                String[] record = dataIterator.next();
            }
            System.out.println("Total Records Loaded: " + count);
        } catch (StateCensusAnalyserException e) {
            e.printStackTrace();
        }
    }

    public boolean loadDataAndVerifyCount(int expectedRecordCount) throws StateCensusAnalyserException {
        Iterator<String[]> dataIterator = csvStateCensus.loadCSVData();
        int actualCount = 0;
        while (dataIterator.hasNext()) {
            actualCount++;
            dataIterator.next();
        }
        return actualCount == expectedRecordCount;
    }

    public boolean loadStateCodeDataAndVerifyCount(int expectedRecordCount) throws StateCensusAnalyserException {
            Iterator<String[]> dataIterator = csvStates.loadCSVData();
            int count = 0;
            while (dataIterator.hasNext()) {
                count++;
                String[] record = dataIterator.next();
            }
            return count == expectedRecordCount;
    }
}