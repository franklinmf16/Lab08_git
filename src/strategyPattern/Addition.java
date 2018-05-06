package strategyPattern;


public class Addition implements Strategy{
    @Override
    public void operation(int number1, int number2){
        int result = number1 + number2;
        System.out.println("addition result is " + result);
    }

}
