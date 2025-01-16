package operation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyThread extends Thread{
    private final FileHolder fileHolder;

    public MyThread(FileHolder fileHolder) {
        this.fileHolder = fileHolder;
    }

    @Override
    public void run() {

        List<String> fileName = new ArrayList<>(fileHolder.fileNames);

        System.out.println("=================");
        Collections.sort(fileName);

        for (String name : fileName) {
            System.out.println(name);
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}