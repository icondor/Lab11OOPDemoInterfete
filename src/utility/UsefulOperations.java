package utility;

public interface UsefulOperations {

     int operation(int... params);

    default void doSmth() {
        System.out.println("do smth ");
    }

    static void staticDoSmth() {
        System.out.println("static do smth in interface");
    }


}
