package berkaybarisalgun.BlogApp.Business.Requests.CommentRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCommentRequest {

    private int id;

    private String content;

    private String author;

    private String email;
}
