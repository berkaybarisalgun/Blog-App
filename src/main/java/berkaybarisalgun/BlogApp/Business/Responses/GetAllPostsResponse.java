package berkaybarisalgun.BlogApp.Business.Responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllPostsResponse {


        private int id;

        private String title;

        private String content;

        private String create_time;

        private int author_id;


}
