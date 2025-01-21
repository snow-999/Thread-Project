package org.example;

import operation.FileHolder;
import operation.MyThread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listOfFileNames = new ArrayList<>();
        listOfFileNames.add("a");
        listOfFileNames.add("e");
        listOfFileNames.add("b");

        List<String> listOfFileNames2 = new ArrayList<>();
        listOfFileNames2.add("d");
        listOfFileNames2.add("c");
        listOfFileNames2.add("f");

        FileHolder fileHolder = new FileHolder(3, listOfFileNames);
        FileHolder fileHolder2 = new FileHolder(3, listOfFileNames2);

        MyThread th1 = new MyThread(fileHolder);
        MyThread th2 = new MyThread(fileHolder2);

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<String> finalList = new ArrayList<>(th1.fileNames);
        finalList.addAll(th2.fileNames);

        Collections.sort(finalList);
        fileHolder.printList(finalList);

    }
}