package berkaybarisalgun.BlogApp.Business.Concretes;

import berkaybarisalgun.BlogApp.Business.Abstracts.PostService;
import berkaybarisalgun.BlogApp.Business.Requests.CreatePostRequest;
import berkaybarisalgun.BlogApp.Business.Requests.UpdatePostRequest;
import berkaybarisalgun.BlogApp.Business.Responses.GetAllPostsResponse;
import berkaybarisalgun.BlogApp.Business.Responses.GetPostByIdResponse;
import berkaybarisalgun.BlogApp.Core.Utilities.mappers.ModelMapperService;
import berkaybarisalgun.BlogApp.Entities.Concretes.Post;
import berkaybarisalgun.BlogApp.Core.Utilities.mappers.ModelMapperManager;
import berkaybarisalgun.BlogApp.DataAccess.Abstracts.PostRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PostManager implements PostService {

    private PostRepository postRepository;
    private ModelMapperService modelMapperService;







    @Override
    public List<GetAllPostsResponse> getAll() {
        List<Post> posts = postRepository.findAll();
        List<GetAllPostsResponse> getAllPostsResponses=posts.stream()
                .map(post->this.modelMapperService.forResponse()
                        .map(post, GetAllPostsResponse.class)).collect(Collectors.toList());

        return getAllPostsResponses;

    }


    @Override
    public GetPostByIdResponse getPostByIdResponse(int id) {
        Post post=postRepository.findById(id).orElseThrow();
        GetPostByIdResponse getPostByIdResponse=modelMapperService.forResponse().map(post,GetPostByIdResponse.class);
        return getPostByIdResponse;
    }

    @Override
    public void update(UpdatePostRequest updatePostRequest) {
        Post post=modelMapperService.forRequest().map(updatePostRequest,Post.class);
        postRepository.save(post);
    }

    @Override
    public void add(CreatePostRequest createPostRequest) {
        Post post=modelMapperService.forRequest().map(createPostRequest,Post.class);
        postRepository.save(post);
    }


}
