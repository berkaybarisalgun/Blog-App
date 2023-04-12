package berkaybarisalgun.BlogApp.Business.Concretes;

import berkaybarisalgun.BlogApp.Business.Abstracts.CommentService;
import berkaybarisalgun.BlogApp.Business.Requests.CommentRequests.CreateCommentRequest;
import berkaybarisalgun.BlogApp.Business.Requests.CommentRequests.UpdateCommentRequest;
import berkaybarisalgun.BlogApp.Business.Responses.CommentResponses.GetCommentByIdResponse;
import berkaybarisalgun.BlogApp.Core.Utilities.mappers.ModelMapperService;
import berkaybarisalgun.BlogApp.DataAccess.Abstracts.CommentRepository;
import berkaybarisalgun.BlogApp.Entities.Concretes.Comment;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CommentManager implements CommentService {

    private CommentRepository commentRepository;

    private ModelMapperService modelMapperService;

    @Override
    public GetCommentByIdResponse getCommentByIdResponse(int id) {
        Comment comment=commentRepository.findById(id).orElseThrow();
        GetCommentByIdResponse getCommentByIdResponse=modelMapperService.forResponse().map(comment,GetCommentByIdResponse.class);
        return getCommentByIdResponse;

    }

    @Override
    public void add(CreateCommentRequest createCommentRequest) {
        Comment comment=modelMapperService.forRequest().map(createCommentRequest,Comment.class);
        commentRepository.save(comment);

    }

    @Override
    public void update(UpdateCommentRequest updateCommentRequest) {
        Comment comment=modelMapperService.forRequest().map(updateCommentRequest,Comment.class);
        commentRepository.save(comment);

    }

    @Override
    public void delete(int id) {
        commentRepository.deleteById(id);
    }
}
