package strategyPattern;


public class Driver {
    public static void main(String[] args) {
        new Driver().run();
    }

    public void run(){
        Manager manager = new Manager();
        manager.setStrategy(new Addition());
        manager.operation(1,2);
        manager.setStrategy(new Multiple());
        manager.operation(1,2);
    }
}
