import java.util.Arrays;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class FindSumOfDigits {
    public static void main(String[] args) {
        String input = "abc1def2hi8jk9lm6";
        /* Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(input);
        Integer sum = 0;
        while (matcher.find()) {
            String val = matcher.group();
            sum += Integer.parseInt(val);
        }
        System.out.println("Sum: " + sum); */

        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(input);
        Stream<String> outputStream =matcher.results().map(MatchResult::group);
        Integer sum = outputStream.mapToInt(i -> Integer.parseInt(i)).sum();
        System.out.println("Sum: " + sum);
    }
}