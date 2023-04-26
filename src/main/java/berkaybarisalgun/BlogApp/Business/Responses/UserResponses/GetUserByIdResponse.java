package berkaybarisalgun.BlogApp.Business.Responses.UserResponses;

import berkaybarisalgun.BlogApp.Entities.Concretes.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetUserByIdResponse {



    private String username;

    private String email;

    private List<Post> posts;




}
