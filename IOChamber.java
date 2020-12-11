import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Files;
import java.util.List;
import java.io.IOException;


public class IOChamber {
    public static void main(String[] patch) {IOChamber();}
    public static void Echo() {
        Scanner scanner = new Scanner(System.in);
        ArrayList echoes = new ArrayList();
        String line = "";
        while ((line = scanner.nextLine()).length() > 0) {
            echoes.add(line);
        }
        for (Object echo : echoes) {
            if (echoes.indexOf(echo) %2 == 0) {
                System.out.println(echo);
            }

        }
    }
    public static void IOChamber(){
        Scanner scanner = new Scanner(System.in);
        try {
            List<String> lines = Files.readAllLines(Paths.get(scanner.nextLine()));
            for (String s: lines) {
                if (lines.indexOf(s) % 2 == 0) {
                    System.out.println(s);
                }
            }
        } catch (IOException e) {
            System.out.println("Файл не распознан. Введите ваши сообщения");
            Echo();
        }
    }
}
