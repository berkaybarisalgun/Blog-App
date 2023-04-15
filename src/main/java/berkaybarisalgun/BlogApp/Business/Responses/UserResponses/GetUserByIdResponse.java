package berkaybarisalgun.BlogApp.Business.Responses.UserResponses;

import berkaybarisalgun.BlogApp.Entities.Concretes.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetUserByIdResponse {



    private String username;

    private String email;

    private String post;


}
