package berkaybarisalgun.BlogApp.Business.Requests.PostRequests;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCommentRequest {
    private String content;

    private String author;

    private String email;



}
