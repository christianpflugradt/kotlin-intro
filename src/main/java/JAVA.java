import java.util.Hashtable;
import java.util.Vector;

public class JAVA {

    private void yesWhatAboutIt() {

        var _1 = "have some appreciation for what Java has achieved";

        var _2 = "Kotlin wouldn't be where it is now without Java";

        var _3 = "Java is 30 years old, and yet...";

        var _4 = "...you can still use Hashtables!";
        var hashtable = new Hashtable(); // yes with a lowercase 't'

        var _5 = "...you can still use Vectors";
        var vector = new Vector(); // do you still remember them?

        var _6 = "...you can still call Thread.stop()";
        new Thread().stop(); // don't do that

        var _7 = "...and you can trigger garbage collection, or at least try";
        Runtime.getRuntime().gc(); // don't do that either

        var _8 = "...and we can even still implement finalize";
        new Finalized();

        var _9 = "all of those are red flags since ages and still they're still supported!";

        var _0 = "Java's backward compatibility is unmatched"; // my opinion
    }

    private static class Finalized {
        @Override
        public void finalize() throws Throwable {
            super.finalize();
            System.out.println("I'm garbage collected");
        }
    }

}
