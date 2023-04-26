package berkaybarisalgun.BlogApp.Business.Abstracts;

import berkaybarisalgun.BlogApp.Business.Responses.UserResponses.GetUserByIdResponse;
import berkaybarisalgun.BlogApp.Entities.Concretes.User;

public interface UserService {
    GetUserByIdResponse getUserByIdResponse(int id);
}
