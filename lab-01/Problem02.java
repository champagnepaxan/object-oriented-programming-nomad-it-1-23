//2 задача Анализ оценок
import java.util.ArrayList;
import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вводите оценки (введите отрицательное число для выхода):");
        while (true) {
            int input = scanner.nextInt();
            if (input < 0) {
                break;
            }
            grades.add(input);
        }

        if (grades.isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }

        double sum = 0;
        int max = grades.get(0);

        for (int grade : grades) {
            sum += grade;

            if (grade > max) {
                max = grade;
            }
        }

        System.out.println("Средний балл: " + (sum / grades.size()));
        System.out.println("Максимальный балл: " + max);
    }
}