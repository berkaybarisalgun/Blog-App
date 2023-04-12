package berkaybarisalgun.BlogApp.Business.Abstracts;

import berkaybarisalgun.BlogApp.Business.Requests.PostRequests.CreateCommentRequest;
import berkaybarisalgun.BlogApp.Business.Responses.CommentResponses.GetCommentByIdResponse;

public interface CommentService {
    GetCommentByIdResponse getCommentByIdResponse(int id);

    void add(CreateCommentRequest createCommentRequest);
}
