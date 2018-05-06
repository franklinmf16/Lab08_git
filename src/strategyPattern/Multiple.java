package strategyPattern;

/**
 * Created by bok on 6/5/18.
 */
public class Multiple implements Strategy {
    @Override
    public void operation(int number1, int number2) {
        int result = number1 * number2;
        System.out.println("Multiple result is " + result);
    }
}
