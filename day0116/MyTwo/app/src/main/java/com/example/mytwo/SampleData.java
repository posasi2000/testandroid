package com.example.mytwo;

public class SampleData {
    private  int poster;        //num=orderNum,          카톡회원번호=핸폰
    private  String movieName;  //foodName음식이름        카톡회원사진
    private   String grade;     //String대신 int price   카톡회원관계=학교지인,동호회선후배


    public SampleData(int poster, String movieName, String grade) {
        this.poster = poster;
        this.movieName = movieName;
        this.grade = grade;
    }//end

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}//class END
