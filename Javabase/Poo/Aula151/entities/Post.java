package Javabase.Poo.Aula151.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private static DateTimeFormatter dFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
   
    private LocalDateTime momment;
    private String title;
    private String content;
    private int likes;
    private List<Comments> comments = new ArrayList<>();
    
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
    public List<Comments> getComments() {
        return comments;
    }
    public void comment(Comments comment){
        comments.add(comment);
    }
  
    @Override
    public String toString() {
        //return "Post:\nmomment=" + momment + "\ntitle:" + title + "\ncontent:" + content + "\nlikes:" + likes;
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(momment.format(dFormatter));
        sb.append(content+"\n");
        sb.append("Comments:\n");
        for (Comments comments2 : comments) {
            sb.append(comments2);
        }
        return sb.toString();

    
    }

}
