package operation;


import java.util.*;

public class FileHolder {
    private int filesNumber;
    private List<String> fileNames;

    public FileHolder(int number, List<String> fileNames) {
        this.filesNumber = number;
        this.fileNames = fileNames;
    }

    public List<String> getFiles() {
        return fileNames;
    }

    public void printList() {
        for (String string : fileNames) {
            System.out.println(string);
        }
    }
}
