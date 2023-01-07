package Javabase.Poo.Aula151.application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Javabase.Poo.Aula151.entities.Comments;
import Javabase.Poo.Aula151.entities.Post;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter dFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        Post post1 = new Post(LocalDateTime.now(),"trevelling to New Zealand","im going to visit this beautful country",12);
        Comments comment1 = new Comments("have a nice trip");
        Comments comment2 = new Comments("that great!");
        post1.comment(comment1);
        post1.comment(comment2);

        Post post2 = new Post(LocalDateTime.parse("07/01/2023 23:14:19", dFormatter),"Good night to you guys","see u tomorrow",5);
        Comments comment21 = new Comments("Good night mate");
        Comments comment22 = new Comments("im also going night dud");
        post2.comment(comment21);
        post2.comment(comment22);
        
        System.out.println(post1);
     
        System.out.println(post2);
        
        
    }
}
