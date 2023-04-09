package berkaybarisalgun.BlogApp.Business.Concretes;

import berkaybarisalgun.BlogApp.Business.Abstracts.PostService;
import berkaybarisalgun.BlogApp.Business.Requests.PostRequests.CreatePostRequest;
import berkaybarisalgun.BlogApp.Business.Requests.PostRequests.UpdatePostRequest;
import berkaybarisalgun.BlogApp.Business.Responses.PostResponses.GetAllPostsResponse;
import berkaybarisalgun.BlogApp.Business.Responses.PostResponses.GetPostByIdResponse;
import berkaybarisalgun.BlogApp.Core.Utilities.mappers.ModelMapperService;
import berkaybarisalgun.BlogApp.Entities.Concretes.Post;
import berkaybarisalgun.BlogApp.DataAccess.Abstracts.PostRepository;
import lombok.AllArgsConstructor;
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
        List<GetAllPostsResponse> getAllPostsResponses = posts.stream()
                .map(post -> this.modelMapperService.forResponse()
                        .map(post, GetAllPostsResponse.class)).collect(Collectors.toList());

        return getAllPostsResponses;

    }


    @Override
    public GetPostByIdResponse getPostByIdResponse(int id) {
        Post post = postRepository.findById(id).orElseThrow();
        GetPostByIdResponse getPostByIdResponse = modelMapperService.forResponse().map(post, GetPostByIdResponse.class);
        return getPostByIdResponse;
    }

    @Override
    public void update(UpdatePostRequest updatePostRequest) {
        Post post = modelMapperService.forRequest().map(updatePostRequest, Post.class);
        postRepository.save(post);
    }

    @Override
    public void add(CreatePostRequest createPostRequest) {
        Post post = modelMapperService.forRequest().map(createPostRequest, Post.class);
        postRepository.save(post);
    }

    @Override
    public void delete(int id) {
        postRepository.deleteById(id);
    }


}
