package operation;

import java.util.Collections;

public class MyThread extends Thread{
    private FileHolder fileHolder;

    public MyThread(FileHolder fileHolder) {
        this.fileHolder = fileHolder;
    }

    @Override
    public void run() {
        Collections.sort(fileHolder.fileNames);
        try {
            Thread.sleep(2000);
            fileHolder.printList();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
