import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.io.IOException;
import java.lang.ArrayIndexOutOfBoundsException;

public class IOChamber extends EchoChamber {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(args[0]));
            for (String s: lines) {
                if (lines.indexOf(s) % 2 == 0) {
                    System.out.println(s);
                }
            }
        } catch (ArrayIndexOutOfBoundsException | IOException e) {
            System.out.println("Файл не распознан. Введите ваши сообщения");
            echo();
        }
    }
}
