package strings.level2;

public class CharacterTypeTable {

    public static String[][] analyze(String text) {

        String[][] table = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            table[i][0] = String.valueOf(ch);

            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                table[i][1] = "aeiou".indexOf(ch) != -1 ? "Vowel" : "Consonant";
            } else {
                table[i][1] = "Not a Letter";
            }
        }
        return table;
    }
}
