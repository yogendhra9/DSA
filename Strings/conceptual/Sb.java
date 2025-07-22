package Strings.conceptual;

public class Sb {
    public static void main(String[] args) {
        String series = "";
    StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char c = (char)('a' + i);
            series = series + c;
            builder.append(series);
            builder.reverse();
        }
        System.out.println(" "+ series + " ");
    
    }
}
