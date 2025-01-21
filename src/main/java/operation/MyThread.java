package operation;

import java.util.ArrayList;
import java.util.List;

public class MyThread extends Thread{
    private final FileHolder fileHolder;
    public List<String> fileNames;

    public MyThread(FileHolder fileHolder) {
        this.fileHolder = fileHolder;
        this.fileNames = new ArrayList<>(fileHolder.fileNames);
    }

    @Override
    public void run() {
        fileHolder.sortList(addToFinalList(fileNames));
        try {
            Thread.sleep(1000);
        }  catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("thread is done");
        }
    }

    public List<String> addToFinalList(List<String> listToAdd) {
        return new ArrayList<>(fileHolder.sortList(listToAdd));
    }
}