package berkaybarisalgun.BlogApp.Business.Abstracts;

import berkaybarisalgun.BlogApp.Business.Requests.CommentRequests.CreateCommentRequest;
import berkaybarisalgun.BlogApp.Business.Requests.CommentRequests.UpdateCommentRequest;
import berkaybarisalgun.BlogApp.Business.Responses.CommentResponses.GetCommentByIdResponse;

public interface CommentService {
    GetCommentByIdResponse getCommentByIdResponse(int id);

    void add(CreateCommentRequest createCommentRequest);

    void update(UpdateCommentRequest updateCommentRequest);

    void delete(int id);
}
