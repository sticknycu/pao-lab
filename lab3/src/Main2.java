import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main2 {
    static String sampleText = "Hello Lab PAO 232";
    
    static Predicate<String> containsPredicate = (text) ->
            sampleText.contains(text);

    static BiPredicate<String, String> containsBiPredicate = (text,
                                                       pattern) -> text.contains(pattern);
    static BiPredicate<String, String>
            containsBiPredicateReferenceMethod = String::contains;

    //static Predicate<Predicate<String>> predicatePredicate = (predicate1) ->
      //      (predicate2) -> predicate1.test(predicate2);
    
    public static void main(String[] args) {
        boolean result = containsPredicate.test("Hello");
        boolean resultNegate =
                containsPredicate.negate().test("Hello");
        var andResult =
                containsBiPredicate.and(containsBiPredicate.negate());
// Logical AND operator.

        boolean booleanorResult =
                containsBiPredicate.or(containsBiPredicate.negate()).test("Hello", "LAB");

        System.out.println(andResult.toString());
    } }