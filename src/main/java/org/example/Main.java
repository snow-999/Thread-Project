package org.example;

import operation.FileHolder;
import operation.MyThread;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listOfFiles = new ArrayList<>();
        listOfFiles.add("characteristics");
        listOfFiles.add("eggplant");
        listOfFiles.add("volcano");
        List<String> listOfFiles2 = new ArrayList<>();
        listOfFiles2.add("tusonami");
        listOfFiles2.add("tornado");
        listOfFiles2.add("earthquek");

        FileHolder fileHolder = new FileHolder(3, listOfFiles);
        FileHolder fileHolder2 = new FileHolder(3, listOfFiles2);

        MyThread th1 = new MyThread(fileHolder);
        MyThread th2 = new MyThread(fileHolder2);

        th1.start();
        th2.start();

    }
}