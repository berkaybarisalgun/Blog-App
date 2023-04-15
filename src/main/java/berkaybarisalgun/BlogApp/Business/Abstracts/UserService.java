package berkaybarisalgun.BlogApp.Business.Abstracts;

import berkaybarisalgun.BlogApp.Business.Responses.UserResponses.GetUserByIdResponse;

public interface UserService {
    GetUserByIdResponse getUserByIdResponse(int id);
}
