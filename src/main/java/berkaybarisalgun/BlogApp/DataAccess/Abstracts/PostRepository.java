package berkaybarisalgun.BlogApp.DataAccess.Abstracts;

import berkaybarisalgun.BlogApp.Entities.Concretes.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Integer> {
}
