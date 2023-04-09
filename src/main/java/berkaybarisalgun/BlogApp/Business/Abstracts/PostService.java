package berkaybarisalgun.BlogApp.Business.Abstracts;

import berkaybarisalgun.BlogApp.Business.Requests.CreatePostRequest;
import berkaybarisalgun.BlogApp.Business.Requests.UpdatePostRequest;
import berkaybarisalgun.BlogApp.Business.Responses.GetAllPostsResponse;
import berkaybarisalgun.BlogApp.Business.Responses.GetPostByIdResponse;

import java.util.List;

public interface PostService {
    List<GetAllPostsResponse> getAll();
    GetPostByIdResponse getPostByIdResponse(int id);

    void update(UpdatePostRequest updatePostRequest);

    void add(CreatePostRequest createPostRequest);

}
