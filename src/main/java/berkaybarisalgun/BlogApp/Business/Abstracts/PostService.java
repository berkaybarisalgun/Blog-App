package berkaybarisalgun.BlogApp.Business.Abstracts;

import berkaybarisalgun.BlogApp.Business.Requests.PostRequests.CreatePostRequest;
import berkaybarisalgun.BlogApp.Business.Requests.PostRequests.UpdatePostRequest;
import berkaybarisalgun.BlogApp.Business.Responses.PostResponses.GetAllPostsResponse;
import berkaybarisalgun.BlogApp.Business.Responses.PostResponses.GetPostByIdResponse;

import java.util.List;

public interface PostService {
    List<GetAllPostsResponse> getAll();
    GetPostByIdResponse getPostByIdResponse(int id);

    void update(UpdatePostRequest updatePostRequest);

    void add(CreatePostRequest createPostRequest);

    void delete(int id);

}
