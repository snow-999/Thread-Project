package operation;


import java.util.*;

public class FileHolder {

    public int filesNumber;
    public List<String> fileNames;

    public FileHolder(int number, List<String> fileNames) {
        this.filesNumber = number;
        this.fileNames = fileNames;
    }

    public List<String> sortList (List<String> list) {
        List<String> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        return sortedList;
    }

    public void printList(List<String> list) {
        for (String string : list) {
            System.out.println(string);
        }
    }
}
