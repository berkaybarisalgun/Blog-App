package berkaybarisalgun.BlogApp.Business.Responses.CommentResponses;

import berkaybarisalgun.BlogApp.Entities.Concretes.Post;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCommentByIdResponse {

    private int id;

    private String content;

    private String create_time;

    private String author;

    private String email;

    private Post post;

}
