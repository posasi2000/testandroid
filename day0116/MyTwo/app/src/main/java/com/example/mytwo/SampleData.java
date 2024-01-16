package com.example.mytwo;

public class SampleData {
    private  int poster;
    private  String movieName;
    private   String grade;

    public SampleData(){ }

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
