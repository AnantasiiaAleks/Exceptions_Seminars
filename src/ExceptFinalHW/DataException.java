package ExceptFinalHW;

public class DataException extends Exception{
    public DataException() {
    }

    public void dataException(String i) {
        System.out.printf("Exception! DataNotCorrectFormat: %s", i);
        System.out.println();
    }
}
