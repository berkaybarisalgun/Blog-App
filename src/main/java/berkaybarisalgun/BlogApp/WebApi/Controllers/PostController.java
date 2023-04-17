package berkaybarisalgun.BlogApp.WebApi.Controllers;

import berkaybarisalgun.BlogApp.Business.Abstracts.PostService;
import berkaybarisalgun.BlogApp.Business.Requests.PostRequests.CreatePostRequest;
import berkaybarisalgun.BlogApp.Business.Requests.PostRequests.UpdatePostRequest;
import berkaybarisalgun.BlogApp.Business.Responses.PostResponses.GetAllPostsResponse;
import berkaybarisalgun.BlogApp.Business.Responses.PostResponses.GetPostByIdResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;



@RestController
@AllArgsConstructor
@RequestMapping("/api/posts")
public class PostController {
    private PostService postService;


    @GetMapping("/getall")
    public List<GetAllPostsResponse> getAll(){
        return postService.getAll();
    }

    @GetMapping("/{id}")
    public GetPostByIdResponse getByid(@PathVariable int id){
        return postService.getPostByIdResponse(id);
    }

    @PutMapping
    public void update(@RequestBody() UpdatePostRequest updatePostRequest){
        this.postService.update(updatePostRequest);
    }

    @PostMapping
    public void add(@RequestBody() CreatePostRequest createPostRequest){
        postService.add(createPostRequest);
    }

    @DeleteMapping()
    public void delete(int id){
        postService.delete(id);
    }
}
