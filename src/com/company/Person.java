package com.company;

/**
 * класс информации про человека
 */
public class Person {
    int id;
    String name;
    String gender;
    String dateBirth;
    Division div = new Division();//
    int salary;

    /**
     *
     * @param masDate
     */
    public Person(String[] masDate){
        id = Integer.parseInt(masDate[0]);
        name = masDate[1];
        gender = masDate[2];
        dateBirth = masDate[3];
        div.setIdDivision((int)(Math.random() * ((60000 - 30000) + 1)) + 30000);
        div.setNametitle(masDate[4]);
        salary = Integer.parseInt(masDate[5]);
    }

    /**
     *печать
     */
    public void print(){
        System.out.print(Integer.toString(id) + ' ');
        System.out.print(' ' + name + ' ');
        System.out.print(gender + ' ');
        System.out.print(dateBirth + ' ');
        System.out.print(div.getIdDivision());
        System.out.print(" ");
        System.out.print(div.getNametitle() + ' ');
        System.out.println(salary);
    }

}