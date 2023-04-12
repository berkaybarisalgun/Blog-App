package berkaybarisalgun.BlogApp.Entities.Concretes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name="comment")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(CommentListener.class)
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="content")
    private String content;

    @Column(name="create_time")
    private LocalDateTime create_time;

    @Column(name="author")
    private String author;
    @Column(name="email")
    private String email;

    @ManyToOne
    @JoinColumn(name="post_id")
    private Post post;
}
