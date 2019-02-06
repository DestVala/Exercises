import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        int num1;
        List<Integer> listOfNumber = new ArrayList<>();

        Scanner scanNumber = new Scanner(System.in);

        while (listOfNumber.size() < 3) {
            {
                try {
                    System.out.println("Podaj liczbę: ");
                    num1 = scanNumber.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("Podałeś liczbę w złym formacie");
                    scanNumber.next();
                    continue;
                }
                listOfNumber.add(num1);
            }
        }

        System.out.println("Podane liczby to : " + listOfNumber.toString());
        System.out.println("Najmniejsza z nich to : " + listOfNumber.stream().min(Integer::compareTo).get());
        System.out.println("Największa z nich to : " + listOfNumber.stream().max(Integer::compareTo).get());
        System.out.println("Suma liczb wynosi : " + listOfNumber.stream().mapToInt(x->x).sum());

    }
}
