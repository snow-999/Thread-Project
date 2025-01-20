package operation;

import java.util.ArrayList;
import java.util.List;

public class MyThread extends Thread{
    private final FileHolder fileHolder;
    public List<String> finalList = new ArrayList<>();

    public MyThread(FileHolder fileHolder) {
        this.fileHolder = fileHolder;
    }

    @Override
    public void run() {
        List<String> fileNames = new ArrayList<>(fileHolder.fileNames);
        addToFinalList(fileNames);
        try {
            Thread.sleep(1000);
        }  catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println(finalList);
        }
    }

    public void addToFinalList(List<String> listToAdd) {
        finalList.addAll(listToAdd);
    }
}