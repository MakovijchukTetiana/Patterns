import java.util.*;
import java.util.stream.*;

public class Lab4FunctionalTasks {

    public static void main(String[] args) {

        List<Integer> intValues = Arrays.asList(7, 14, 22, 9, 4, 33, 10, 14, 8);
        List<Double> doubleValues = Arrays.asList(3.14, 2.71, 9.81, 4.0);
        List<String> cities = Arrays.asList("Kyiv", "lviv", "", "Odesa", "Kharkiv", "Dnipro");
        String textSnippet = "Сьогодні чудова погода для вивчення програмування на мові Java";

        System.out.println("Завдання 1 (Непарні елементи): " + getOddElements(intValues));
        System.out.println("Завдання 2 (Середнє арифметичне): " + computeMeanValue(doubleValues));
        System.out.println("Завдання 3 (Міста за алфавітом): " + sortStringsAlphabetically(cities));
        System.out.println("Завдання 4 (Загальна сума парних): " + getTotalOfEvens(intValues));
        System.out.println("Завдання 5 (Факторіал числа 6): " + findFactorial(6));

        System.out.print("Завдання 6 (Агрегація списку): ");
        printSumAndProduct(intValues);

        System.out.println("Завдання 7 (Значення в квадраті): " + getSquaredValues(intValues));
        System.out.println("Завдання 8 (Міста за довжиною назви): " + orderStringsByLength(cities));
        System.out.println("Завдання 9 (Слів у реченні): " + calculateWordCount(textSnippet));
        System.out.println("Завдання 10 (Перший валідний рядок): " + getFirstValidString(cities));
        System.out.println("Завдання 11 (Чи всі назви з великої літери?): " + areAllCapitals(cities));
        System.out.println("Завдання 12 (Друге найбільше число): " + getSecondHighest(intValues));
        System.out.println("Завдання 13 (Найбільше серед парних): " + getMaximumEven(intValues));
    }

    // 1. Фільтрація непарних чисел
    public static List<Integer> getOddElements(List<Integer> nums) {
        return nums.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());
    }

    // 2. Обчислення середнього значення дійсних чисел
    public static double computeMeanValue(List<Double> fractions) {
        return fractions.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    // 3. Сортування рядків (ігноруючи регістр)
    public static List<String> sortStringsAlphabetically(List<String> items) {
        return items.stream()
                .sorted(String::compareToIgnoreCase)
                .collect(Collectors.toList());
    }

    // 4. Сума виключно парних елементів
    public static int getTotalOfEvens(List<Integer> nums) {
        return nums.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    // 5. Знаходження факторіалу
    public static long findFactorial(int val) {
        return LongStream.rangeClosed(1, val)
                .reduce(1, (acc, next) -> acc * next);
    }

    // 6. Одночасне знаходження суми та добутку
    public static void printSumAndProduct(List<Integer> nums) {
        long sumResult = nums.stream().reduce(0, Integer::sum);
        long productResult = nums.stream().reduce(1, (acc, next) -> acc * next);
        System.out.println("Сума: " + sumResult + ", Добуток: " + productResult);
    }

    // 7. Піднесення до квадрату
    public static List<Integer> getSquaredValues(List<Integer> nums) {
        return nums.stream()
                .map(x -> (int) Math.pow(x, 2))
                .collect(Collectors.toList());
    }

    // 8. Сортування за кількістю символів у рядку
    public static List<String> orderStringsByLength(List<String> items) {
        return items.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }

    // 9. Розбиття речення на слова та їх підрахунок
    public static long calculateWordCount(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        return Arrays.stream(str.trim().split("\\s+")).count();
    }

    // 10. Пошук першого рядка, який містить текст
    public static String getFirstValidString(List<String> items) {
        return items.stream()
                .filter(item -> item != null && !item.isEmpty())
                .findFirst()
                .orElse("Немає даних");
    }

    // 11. Перевірка першої літери кожного валідного рядка
    public static boolean areAllCapitals(List<String> items) {
        List<String> validItems = items.stream()
                .filter(item -> !item.isEmpty())
                .collect(Collectors.toList());

        if (validItems.isEmpty()) return false;

        return validItems.stream()
                .allMatch(item -> Character.isUpperCase(item.charAt(0)));
    }

    // 12. Знаходження другого за величиною елемента
    public static Integer getSecondHighest(List<Integer> nums) {
        return nums.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
    }

    // 13. Знаходження максимального значення серед парних
    public static Integer getMaximumEven(List<Integer> nums) {
        return nums.stream()
                .filter(x -> x % 2 == 0)
                .max(Integer::compareTo)
                .orElse(null);
    }
}