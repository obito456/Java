@FunctionalInterface
interface MyFunctionalInterface {
    void execute();
}

public class LambdaExample {
    public static void main(String[] args) {
        // Using an anonymous class
        MyFunctionalInterface myFunc = new MyFunctionalInterface() {
            @Override
            public void execute() {
                System.out.println("Hello, World!");
            }
        };

        // Using a lambda expression
        MyFunctionalInterface myFuncLambda = () -> System.out.println("Hello, World!");

        // Call the method
        myFunc.execute();
        myFuncLambda.execute();
    }
}
