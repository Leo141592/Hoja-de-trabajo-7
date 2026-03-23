import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        BinaryTree<Association<String, String>> tree = new BinaryTree<>();

        // 🔹 1. Leer diccionario.txt
        try {
            BufferedReader br = new BufferedReader(new FileReader("diccionario.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                line = line.replace("(", "").replace(")", "").trim();
                String[] parts = line.split(",");

                String english = parts[0].trim().toLowerCase();
                String spanish = parts[1].trim().toLowerCase();

                Association<String, String> pair = new Association<>(english, spanish);
                tree.insert(pair);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error leyendo diccionario.txt");
        }

        // 🔹 2. Mostrar in-order
        System.out.println("Diccionario ordenado:");
        tree.inOrder();

        // 🔹 3. Traducir texto.txt
        System.out.println("\nTraducción:");

        try {
            BufferedReader br = new BufferedReader(new FileReader("texto.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");

                for (String word : words) {

                    String cleanWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

                    Association<String, String> searchKey =
                            new Association<>(cleanWord, "");

                    Association<String, String> result = tree.search(searchKey);

                    if (result != null) {
                        System.out.print(result.getValue() + " ");
                    } else {
                        System.out.print("*" + word + "* ");
                    }
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error leyendo texto.txt");
        }
    }
}