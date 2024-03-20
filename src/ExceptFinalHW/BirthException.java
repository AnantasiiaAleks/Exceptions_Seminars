package ExceptFinalHW;

public class BirthException extends Exception {
    public BirthException() {
    }

    public void birthException(String i) {
        System.out.printf("Exception! BirthDateNotCorrectFormat: %s", i);
        System.out.println();
    }
}
