package com.company;

import java.io.*;
import java.util.LinkedList;
import java.util.Arrays;

/**
 * класс мейн
 */
public class Main {
    /**
     *
     * @param args аргумент командной строки
     */
    public static void main(String[] args) {
        String csvFilePath = "foreign_names.csv";//файл с данными
        String str = "";

        try {
            FileReader reader = new FileReader(csvFilePath);
            char[] massChar = new char[256];
            int tempStr = reader.read(massChar);

            while(tempStr == 256){
                String tmp = new String(massChar);
                str += tmp;
                tempStr = reader.read(massChar);
            }

            massChar = Arrays.copyOf(massChar, tempStr);
            String tmp = new String(massChar);
            str += tmp;
        }

        catch (IOException e){//ошибка чего
            System.out.println(e.getMessage());
        }

        LinkedList<Person> listPerson = new LinkedList<>();
        String[] oneline = str.split("\r\n");

        for(int i = 1; i < oneline.length; i++) {
            listPerson.addLast(new Person(oneline[i].split(";")));
        }

        for (Person pers : listPerson) {
            pers.print();
        }
    }
}
