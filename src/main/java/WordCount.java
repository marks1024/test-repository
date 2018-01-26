public class WordCount {
    public static int countWords(String text)
    {
        String replaced = text.replaceAll("--", " ");
        return replaced.split("\\s+").length;
    }
}
