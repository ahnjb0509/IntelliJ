import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {
       FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("src/chicken.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(inputStream);
        String line = scanner.nextLine();
        System.out.println(line);
        String lien2 = scanner.nextLine();
        System.out.println(lien2);


    }
}
