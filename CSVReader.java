import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "students.csv";
        String line = "";
        String csvSplitBy = ",";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                for (String value : data) {
                    System.out.print(value + " ");
                }
                System.out.println();
                count++;
            }
            System.out.println("Jumlah baris: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
