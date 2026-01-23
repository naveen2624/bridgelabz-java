package linearandbinarysearch.linearsearch;

public class SearchWordInSentences {

    static String searchWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
                "Java is powerful",
                "Data structures are important",
                "Binary search is fast"
        };

        String result = searchWord(sentences, "search");
        System.out.println(result);
    }
}
