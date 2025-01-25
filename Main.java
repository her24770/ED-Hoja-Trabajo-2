import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> profixExpresions = leerTxt();

        for (ArrayList<String> line : profixExpresions) {
            System.out.println(line);
        }
    }

    public static ArrayList<ArrayList<String>> leerTxt() {
        ArrayList<ArrayList<String>> documentLines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                ArrayList<String> charOperation = new ArrayList<>();
                for (char str : line.toCharArray()) {
                    if (str != ' ') {
                        charOperation.add(String.valueOf(str));
                    }
                }
                documentLines.add(charOperation);
            }
        } catch (IOException e) {
            System.out.println("Error en lectura del documento: " + e.getMessage());
        }

        return documentLines;
    }
    
}
