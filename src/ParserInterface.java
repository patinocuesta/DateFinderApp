import static java.text.DateFormat.FULL;
import static java.text.DateFormat.LONG;
import static java.text.DateFormat.MEDIUM;
import static java.text.DateFormat.SHORT;
import static java.util.Locale.FRANCE;
import static java.util.Locale.GERMANY;
import static java.util.Locale.UK;
import static java.util.Locale.US;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public interface ParserInterface {
    Locale[] locales = { US, UK, GERMANY, FRANCE };
    int[] styles = { FULL, LONG, MEDIUM, SHORT };
    String[] styleNames = { "FULL", "LONG", "MEDIUM", "SHORT" };
}
