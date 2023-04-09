package berkaybarisalgun.BlogApp.Business.Requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePostRequest {

    private String title;

    private String content;

    private int author_id;
}
