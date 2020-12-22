import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.io.IOException;
import java.lang.ArrayIndexOutOfBoundsException;

public class IOChamber extends EchoChamber {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(args[0]));
            for (int i = 0; i < lines.size(); i+=2) {
                    System.out.println(lines.get(i));
            }
        } catch (ArrayIndexOutOfBoundsException | IOException e) {
            System.out.println("Файл не распознан. Введите ваши сообщения");
            echo();
        }
    }
}
