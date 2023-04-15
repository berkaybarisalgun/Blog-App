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
        User user=userRepository.findById(id).orElseThrow();
        GetUserByIdResponse getUserByIdResponse=modelMapperService.forResponse().map(user,GetUserByIdResponse.class);
        return getUserByIdResponse;
    }
}
