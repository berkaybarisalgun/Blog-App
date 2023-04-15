package berkaybarisalgun.BlogApp.DataAccess.Abstracts;

import berkaybarisalgun.BlogApp.Entities.Concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
