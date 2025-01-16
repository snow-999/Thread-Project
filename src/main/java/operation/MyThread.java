package operation;

import java.util.Collections;

public class MyThread extends Thread{
    private FileHolder fileHolder;

    public MyThread(FileHolder fileHolder) {
        this.fileHolder = fileHolder;
    }

    @Override
    public void run() {
        Collections.sort(fileHolder.getFiles());
        fileHolder.printList();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
