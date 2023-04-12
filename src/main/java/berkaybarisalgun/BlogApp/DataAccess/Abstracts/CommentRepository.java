package berkaybarisalgun.BlogApp.DataAccess.Abstracts;

import berkaybarisalgun.BlogApp.Entities.Concretes.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Integer> {
}
