package linearandbinarysearch.stringbuffer;

public class ConcatenateUsingStringBuffer {

    public static void main(String[] args) {
        String[] words = {"Java", " ", "is", " ", "powerful"};

        StringBuffer sb = new StringBuffer();

        for (String word : words) {
            sb.append(word);
        }

        System.out.println("Concatenated String: " + sb.toString());
    }
}
