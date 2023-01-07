package Javabase.Poo.Aula151.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Post {
    private LocalDateTime momment;
    private String title;
    private String content;
    private int likes;
    
    public Post(){}
    public Post(LocalDateTime momment, String title, String content, int likes) {
        this.momment = momment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDateTime getMomment() {
        return momment;
    }
    public void setMomment(LocalDateTime momment) {
        this.momment = momment;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
     
}
