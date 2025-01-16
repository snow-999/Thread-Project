package operation;


import java.util.*;

public class FileHolder {
    public int filesNumber;
    public List<String> fileNames;

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

    public void setFileNames(String fileName) {
        try {
            for (int i = 0; i < filesNumber; i++) {
                fileNames.add(fileName);
            }
        } catch (Exception e) {
            System.out.println("You Should Enter " + filesNumber + "Names");
        }
    }
}
