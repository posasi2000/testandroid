package com.example.test0107;

public class Fruit {
    int img;  //과일그림
    String name; //과일이름
    String from;  //과일원산지
    int from_flag;
    String date; //과일입고날짜  new Date클래스, Calendar클래스

    public Fruit() {
    }

    public Fruit(int img, String name, String from, int from_flag, String date) {
        this.img = img;
        this.name = name;
        this.from = from;
        this.from_flag = from_flag;
        this.date = date;
    }//end
}//class END