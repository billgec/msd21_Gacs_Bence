import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        double number1 = 113;
        double number2 = 2;
        System.out.println(add(number1, number2));
        System.out.println(minus(number1, number2));
        System.out.println(divide(number1, number2));
        System.out.println(multiply(number1, number2));
        logger.info("hello world");
        logger.error("foo");
    }

    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    public static double minus(double number1, double number2) {
        return number1 - number2;
    }

    public static double divide(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("bad");
        } else {
            return number1 / number2;
        }
        return 0;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }


}
