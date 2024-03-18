package Seminar3.Tasks.Task2;

import java.io.IOException;

public class Counter implements AutoCloseable {
    private Integer count;

    public Counter(){
        this.count = 0;
    }
    public void add() throws IOException{
        checkClose();
        this.count++;
    }
    public void checkClose() throws IOException{
        if (count == null){
            throw new IOException("Экземпляр закрыт!");
        }
    }
    public Integer getValue() throws IOException {
        checkClose();
        return count;
    }
    @Override
    public void close(){
        this.count = null;
    }

}
