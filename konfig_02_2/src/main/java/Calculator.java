import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This is a small calculator
 *
 * @author bence
 * @param  number1  this the first half of the calculator
 * @param  number2 this is the second half of the calculator
 * @return      each method returns the correspoding calculation
 */
public class Calculator {
    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        double number1 = 113;
        double number2 = 12;
        System.out.println(add(number1, number2));
        System.out.println(minus(number1, number2));
        System.out.println(divide(number1, number2));
        System.out.println(multiply(number1, number2));
        logger.info("hello world");
        logger.error("foo");
    }

    public static double add(double number1, double number2) {
        logger.debug(String.valueOf(number1),String.valueOf(number2));
        return number1 + number2;
    }

    public static double minus(double number1, double number2) {
        logger.debug(String.valueOf(number1),String.valueOf(number2));
        return number1 - number2;
    }

    public static double divide(double number1, double number2) {
        logger.debug(String.valueOf(number1),String.valueOf(number2));
        if (number2 == 0) {
            System.out.println("bad");
            logger.error("dividing by zero not possible");
        } else {
            return number1 / number2;
        }
        return 0;
    }

    public static double multiply(double number1, double number2) {
        logger.debug(String.valueOf(number1),String.valueOf(number2));
        return number1 * number2;
    }


}
