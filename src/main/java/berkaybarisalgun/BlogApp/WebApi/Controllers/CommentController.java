package berkaybarisalgun.BlogApp.WebApi.Controllers;

import berkaybarisalgun.BlogApp.Business.Abstracts.CommentService;
import berkaybarisalgun.BlogApp.Business.Requests.PostRequests.CreateCommentRequest;
import berkaybarisalgun.BlogApp.Business.Responses.CommentResponses.GetCommentByIdResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/comments")
public class CommentController {
    private CommentService commentService;

    @GetMapping("/{id}")
    public GetCommentByIdResponse getByid(@PathVariable int id){
        return commentService.getCommentByIdResponse(id);

    }

    @PostMapping
    public void add(@RequestBody() CreateCommentRequest createCommentRequest){
        commentService.add(createCommentRequest);
    }
}
