import java.util.Scanner;
import java.util.ArrayList;
public class EchoChamber {
    public static void main(String[] args) {Echo();}
    public static void Echo() {
        Scanner scanner = new Scanner(System.in);
        ArrayList echoes = new ArrayList();
        String line = "";
        while ((line = scanner.nextLine()).length() > 0) {
            echoes.add(line);
        }
        for (Object echo : echoes) {
            System.out.println(echo);
        }
    }
}
