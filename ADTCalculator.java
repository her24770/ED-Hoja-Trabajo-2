import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ADTCalculator {
    public void calculate(String file) {
        
        
        ArrayList<ArrayList<String>> documentLines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Separar palabras por espacios
                ArrayList<String> prefixOperation = new ArrayList<>(Arrays.asList(line.split(" ")));
                documentLines.add(prefixOperation);
            }
        } catch (IOException e) {
            System.out.println("Error en lectura del documento: " + e.getMessage());
        }

        //
        Stack<Double> stack = new Stack<>();
        for (ArrayList<String> line : documentLines) {

            for (String str : line) {
                if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("%")) {
                    double value2 = stack.pop();
                    double value1 = stack.pop();
                    stack.push(stack.operation(str.charAt(0), value1, value2));
                } else {
                    stack.push(Double.parseDouble(str));
                }
            }


            System.out.println("\nOperación:" + line);

            
            if (stack.getFirst() != stack.getLast()) {

                System.out.println("Error de Sintaxis");

            } else {

                System.out.println("Resultado: " + stack.pop());
            }
        }

    }
}
