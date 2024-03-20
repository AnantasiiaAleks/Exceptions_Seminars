package ExceptFinalHW;

public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.printf("Exception! SexNotCorrectData: %s", i);
        System.out.println();
    }
}
