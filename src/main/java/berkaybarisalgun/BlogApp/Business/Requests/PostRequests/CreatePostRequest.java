package berkaybarisalgun.BlogApp.Business.Requests.PostRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePostRequest {

    private String title;

    private String content;

    private int userId;
    //kendime not:eğer düzgün isimlendirmezsen maplemeyi yapmıyor.


}
