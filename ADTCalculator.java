import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ADTCalculator {
    public void calculate(String file) {
        Stack<Integer> stack = new Stack<>();
        
        ArrayList<ArrayList<String>> documentLines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                ArrayList<String> prefixOperation = new ArrayList<>();
                for (char str : line.toCharArray()) {
                    if (str != ' ') {
                        prefixOperation.add(String.valueOf(str));
                    }
                }
                documentLines.add(prefixOperation);
            }
        } catch (IOException e) {
            System.out.println("Error en lectura del documento: " + e.getMessage());
        }

        for (ArrayList<String> line : documentLines) {

            for (String str : line) {
                if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("%")) {
                    int value2 = stack.pop();
                    int value1 = stack.pop();
                    stack.push(stack.operation(str.charAt(0), value1, value2));
                } else {
                    stack.push(Integer.parseInt(str));
                }
            }

            System.out.println("\nOperación:" + line);

            System.out.println("Resultado: " + stack.pop());

        }

    }
}
