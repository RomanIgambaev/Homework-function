import java.util.Scanner;

public class Main {
    static String removeVowels(String word) {
        StringBuilder result = new StringBuilder();
        String vowels = "aeiou"; // Включите заглавные гласные буквы

        for (int i = 0; i < word.length(); ++i) {
            char currentChar = word.toLowerCase().charAt(i);
            if (vowels.indexOf(currentChar) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    static int eliminateUnsetBits(String number) {
        int decimalResult = 0;
        int base = 1;

        for (int i = number.length() - 1; i >= 0; i--) {
            char currentChar = number.charAt(i);
            if (currentChar == '1') {
                decimalResult += base;
            }
            base *= 2;
        }
        String binaryWithoutZeros = number.replaceAll("0", "");
        System.out.println(binaryWithoutZeros);
        return decimalResult;
    }


    static String searchNumberInLine(String text) {
        StringBuilder numbers = new StringBuilder();
        for (int i = 0; i < text.length(); ++i) {
            if (text.charAt(i) >= '1' && text.charAt(i) <= '9') {
                numbers.append(text.charAt(i));
            }
        }
        return numbers.toString();
    }
        public static int findRotation(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return -1;
            }
            String combined = str1 + str1;
            if (combined.contains(str2)) {
                for (int i = 0; i < str1.length(); i++) {
                    if (combined.charAt(i) == str2.charAt(0)) {
                        return i;
                    }
                }
            }

            return -1;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите слово на английском:");
            String word = scanner.nextLine();
            String result = removeVowels(word);
            System.out.println("Результат после удаления гласных: " + result);
            System.out.println("Введите двоичное число");
            String number = scanner.nextLine();
            System.out.println(eliminateUnsetBits(number));
            System.out.println("Введите текст с цифрами");
            String userText = scanner.nextLine();
            System.out.println(searchNumberInLine(userText));
            System.out.println("Запишите два слова");
            String userWord1 = scanner.nextLine();
            String userWord2 = scanner.nextLine();
            System.out.println(findRotation(userWord1,userWord2));
        }
    }
