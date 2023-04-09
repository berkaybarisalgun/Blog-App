package berkaybarisalgun.BlogApp.Entities.Concretes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="comment")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="content")
    private String content;

    @Column(name="create_time")
    private String create_time;

    @Column(name="author")
    private String author;
    @Column(name="email")
    private String email;

    @ManyToOne
    @JoinColumn(name="post_id")
    private Post post;
}
