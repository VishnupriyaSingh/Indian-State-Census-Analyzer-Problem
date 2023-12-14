import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class CSVStateCensus {
    private String filePath;

    public CSVStateCensus(String filePath) {
        this.filePath = filePath;
    }

    public Iterator<String[]> loadCSVData() throws StateCensusAnalyserException {
        if (!filePath.endsWith(".csv")) {
            throw new StateCensusAnalyserException("Incorrect file type: Expected a .csv file");
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();
            if (line == null || !line.equals("SrNo,StateName,TIN,StateCode")) {
                throw new StateCensusAnalyserException("Incorrect CSV header");
            }

            ArrayList<String[]> records = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                records.add(data);
            }
            br.close();
            return records.iterator();
        } catch (IOException e) {
            throw new StateCensusAnalyserException("Error reading CSV file: " + e.getMessage());
        }
    }
}