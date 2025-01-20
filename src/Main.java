// Полное решение всех задач из файла

class TaskSolutions {

    // 1. Функция для нахождения максимума
    public static int findMax(int a, int b) throws Exception {
        if (a == b) {
            throw new Exception("Числа равны!");
        }
        return Math.max(a, b);
    }

    // 2. Калькулятор деления
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо!");
        }
        return a / b;
    }

    // 3. Конвертер строк в числа
    public static int convertToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Невозможно преобразовать строку в число!");
        }
    }

    // 4. Проверка возраста
    public static void checkAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Возраст должен быть в пределах от 0 до 150!");
        }
    }

    // 5. Нахождение корня
    public static double findSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным!");
        }
        return Math.sqrt(number);
    }

    // 6. Факториал
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным!");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 7. Проверка массива на нули
    public static void checkArrayForZeros(int[] arr) {
        for (int num : arr) {
            if (num == 0) {
                throw new IllegalArgumentException("Массив содержит ноль!");
            }
        }
    }

    // 8. Калькулятор возведения в степень
    public static double power(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Показатель степени не может быть отрицательным!");
        }
        return Math.pow(base, exponent);
    }

    // 9. Обрезка строки
    public static String trimString(String str, int length) {
        if (length > str.length()) {
            throw new IllegalArgumentException("Длина больше длины строки!");
        }
        return str.substring(0, length);
    }

    // 10. Поиск элемента в массиве
    public static int findElement(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        throw new IllegalArgumentException("Элемент не найден в массиве!");
    }

    // 11. Конвертация в двоичную систему
    public static String toBinary(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным!");
        }
        return Integer.toBinaryString(number);
    }

    // 12. Проверка делимости
    public static boolean isDivisible(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо!");
        }
        return a % b == 0;
    }

    // 13. Чтение элемента списка
    public static <T> T getElementFromList(java.util.List<T> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс вне допустимого диапазона!");
        }
        return list.get(index);
    }

    // 14. Парольная проверка
    public static void checkPasswordStrength(String password) {
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Пароль слишком слабый!");
        }
    }

    // 15. Проверка даты
    public static void checkDateFormat(String date) {
        try {
            java.time.LocalDate.parse(date, java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (java.time.format.DateTimeParseException e) {
            throw new IllegalArgumentException("Некорректный формат даты!");
        }
    }

    // 16. Конкатенация строк
    public static String concatenateStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Одна из строк равна null!");
        }
        return str1 + str2;
    }

    // 17. Остаток от деления
    public static int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо!");
        }
        return a % b;
    }

    // 18. Квадратный корень
    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным!");
        }
        return Math.sqrt(number);
    }

    // 19. Конвертер температуры
    public static double celsiusToFahrenheit(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Температура ниже абсолютного нуля!");
        }
        return celsius * 9 / 5 + 32;
    }

    // 20. Проверка строки на пустоту
    public static void checkStringNotEmpty(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка пустая или равна null!");
        }
    }

    public static void main(String[] args) {
        // Примеры вызова всех функций
        try {
            System.out.println("Максимум: " + findMax(10, 20));
            System.out.println("Результат деления: " + divide(10, 2));
            System.out.println("Преобразование строки в число: " + convertToInt("123"));
            checkAge(25);
            System.out.println("Корень из числа: " + findSquareRoot(16));
            System.out.println("Факториал: " + factorial(5));
            checkArrayForZeros(new int[]{1, 2, 3});
            System.out.println("Степень: " + power(2, 3));
            System.out.println("Обрезка строки: " + trimString("Пример", 4));
            System.out.println("Индекс элемента: " + findElement(new int[]{1, 2, 3}, 2));
            System.out.println("Двоичное представление: " + toBinary(10));
            System.out.println("Делимость: " + isDivisible(10, 2));
            java.util.List<String> list = java.util.Arrays.asList("A", "B", "C");
            System.out.println("Элемент списка: " + getElementFromList(list, 1));
            checkPasswordStrength("StrongPass1");
            checkDateFormat("20.01.2025");
            System.out.println("Конкатенация строк: " + concatenateStrings("Hello", " World"));
            System.out.println("Остаток: " + modulo(10, 3));
            System.out.println("Квадратный корень: " + squareRoot(25));
            System.out.println("Температура в Фаренгейтах: " + celsiusToFahrenheit(0));
            checkStringNotEmpty("Текст");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
