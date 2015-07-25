package content;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import user.User;

import java.util.Date;

/**
 * @author Hamid Ramazani (mrramazani@gmail.com)
 *         Created on 7/23/2015
 */
@Document
public class Comment {

    @Id
    private ObjectId id;
//    private CommentRepository;
    private String comment;
    private User user;
    private Date date;
    private Content content;

    public Comment(String comment, User user, Date date, Content content) {
        this.comment = comment;
        this.user = user;
        this.date = date;
        this.content = content;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }
}
