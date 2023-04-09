package berkaybarisalgun.BlogApp.Entities.Concretes;

import jakarta.persistence.PrePersist;

import java.time.LocalDateTime;

public class PostListener {
    @PrePersist
    public void setCreateTime(Post post) {
        post.setCreate_time(LocalDateTime.now());
    }
}
