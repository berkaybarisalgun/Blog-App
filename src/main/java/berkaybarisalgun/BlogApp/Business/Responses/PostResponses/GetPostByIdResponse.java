package berkaybarisalgun.BlogApp.Business.Responses.PostResponses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetPostByIdResponse {
    private int id;

    private String title;

    private String content;

    private String create_time;

    private int user_id;

    private int author_id;
}
