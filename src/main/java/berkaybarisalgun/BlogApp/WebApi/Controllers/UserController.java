package berkaybarisalgun.BlogApp.WebApi.Controllers;

import berkaybarisalgun.BlogApp.Business.Abstracts.UserService;
import berkaybarisalgun.BlogApp.Business.Responses.UserResponses.GetUserByIdResponse;
import berkaybarisalgun.BlogApp.DataAccess.Abstracts.UserRepository;
import berkaybarisalgun.BlogApp.Entities.Concretes.Post;
import berkaybarisalgun.BlogApp.Entities.Concretes.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    private UserRepository userRepository;

    @GetMapping("/{id}")
    private GetUserByIdResponse getById(@PathVariable int id){
        System.out.println("BURDAAAAAAA1");
        User user=userRepository.findById(id).orElse(null);
        System.out.println("burdaaaaaaaaaa2");
        GetUserByIdResponse response=new GetUserByIdResponse();
        System.out.println("burdaaaaaaaaaa3");
        response.setUsername(user.getUsername());
        response.setEmail(user.getEmail());
        System.out.println("burdaaaaaaaaaa4");
        if (user != null) {
            List<Post> posts = user.getPostsx();
            for (Post post : posts) {
                System.out.println("icindeyim");
                System.out.println(post.getTitle());
            }
        }
        else{
            System.out.println("user null aq");
        }
        response.setPosts(user.getPostsx());
        System.out.println("burdaaaaaaaaaa5");
        System.out.println(response);
        return response;
    }


}
