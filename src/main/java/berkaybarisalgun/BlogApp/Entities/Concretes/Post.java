package berkaybarisalgun.BlogApp.Entities.Concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name="post")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="title")
    private String title;
    //title: required, title of the post;

    @Column(name="content")
    private String content;
    //content: required, body content of the post which uses the Markdown format;

    @Column(name="create_time")
    private String create_time;

    @Column(name="author_id")
    private int author_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;





}
