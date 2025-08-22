import java.util.SortedMap;

public class Task18 {
    public void task18() {

        String name = "kajak";

        StringBuilder reversedText = new StringBuilder(name);
        reversedText.reverse();

        if (name.equals(reversedText.toString())) {
            System.out.println("to jest palindrom");
        } else {
            System.out.println("nie jest palindromem");

        }
        System.out.println("two arrays task");
        String text = "kajak";
        char[] letters = text.toCharArray();
        char[] reversedLetters = new char[letters.length];

        for (int i = 0; i < letters.length; i++) {
            reversedLetters[i] = letters[letters.length - 1 - i];
        }

        boolean isPalindrom = true;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != reversedLetters[i]) {
                isPalindrom = false;
                break;
            }
        }

        if (isPalindrom) {
            System.out.println("to jest palindrom");
        } else {
            System.out.println("to nie jest palindrom");
        }


        System.out.println(letters);
        System.out.println(reversedLetters);


        System.out.println("last try");
        String słowo = "kaj0ak";

        int left = 0;
        int right = słowo.length() - 1;

        boolean isPalindromm = true;

        while (left<right) {
            if (słowo.charAt(left) != słowo.charAt(right)) {
                isPalindromm = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindromm) {
            System.out.println("to jest palindrom");
        } else {
            System.out.println("to nie jest palindrom");
        }




    }
}
