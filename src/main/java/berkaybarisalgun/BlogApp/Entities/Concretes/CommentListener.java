package berkaybarisalgun.BlogApp.Entities.Concretes;

import berkaybarisalgun.BlogApp.Business.Abstracts.CommentService;
import jakarta.persistence.PrePersist;

import java.time.LocalDateTime;

public class CommentListener {

    @PrePersist
    public void setCreateTime(Comment comment) {
        LocalDateTime now = LocalDateTime.now();
        // set create_time to a new LocalDateTime object with only day, month, year, hour, and minute information
        LocalDateTime createTime = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), now.getHour(), now.getMinute());
        comment.setCreate_time(createTime);
    }
}
