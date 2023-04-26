package berkaybarisalgun.BlogApp.Business.Concretes;

import berkaybarisalgun.BlogApp.Business.Abstracts.UserService;
import berkaybarisalgun.BlogApp.Business.Responses.UserResponses.GetUserByIdResponse;
import berkaybarisalgun.BlogApp.Core.Utilities.mappers.ModelMapperService;
import berkaybarisalgun.BlogApp.DataAccess.Abstracts.UserRepository;
import berkaybarisalgun.BlogApp.Entities.Concretes.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class UserManager implements UserService {

    private UserRepository userRepository;

    private ModelMapperService modelMapperService;


    @Override
    public GetUserByIdResponse getUserByIdResponse(int id) {
        System.out.println("burdaaaaaaaaaa6");
        User user=userRepository.findById(id).orElse(null);
        System.out.println("burdaaaaaaaaaa7");
        if (user == null) {
            System.out.println("burdaaaaaaaaaa9");
            // Kullanıcı bulunamadıysa null döndürün veya bir istisna fırlatın.
            return null;
        }
        System.out.println("burdaaaaaaaaaa8");
        return modelMapperService.forResponse().map(user, GetUserByIdResponse.class);
    }
}
