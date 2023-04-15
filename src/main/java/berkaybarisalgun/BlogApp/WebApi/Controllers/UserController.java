package berkaybarisalgun.BlogApp.WebApi.Controllers;

import berkaybarisalgun.BlogApp.Business.Abstracts.UserService;
import berkaybarisalgun.BlogApp.Business.Responses.UserResponses.GetUserByIdResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    @GetMapping("/{id}")
    private GetUserByIdResponse getById(@PathVariable int id){
        return userService.getUserByIdResponse(id);
    }


}
