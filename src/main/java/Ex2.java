import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        boolean end = false;
        String text;
        List<Integer> listOfNumbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Żeby zakończyć wprowadzanie wpisz: end");

        while (!end) {
            System.out.println("Podaj liczbę: ");
            text = scan.nextLine();

            if (isInteger(text)) {
                listOfNumbers.add(Integer.parseInt(text));
            } else if (text.equals("end")) {
                end = true;
            } else System.out.println("Podałeś złą wartość");
        }

        System.out.println("Lista: " + listOfNumbers.toString());
        System.out.println("Suma liczb to: " + sumList(listOfNumbers));
        System.out.println("Najmniejsza z nich to : " + listOfNumbers.stream().min(Integer::compareTo).get());
        System.out.println("Największa z nich to : " + listOfNumbers.stream().max(Integer::compareTo).get());

    }

    private static int sumList(List<Integer> list) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    private static boolean isInteger(String text) {
        if (text == null)
            return false;
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}


