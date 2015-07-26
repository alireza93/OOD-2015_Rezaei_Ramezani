package repository;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import content.Content;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;
import user.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hamid Ramazani (mrramazani@gmail.com)
 *         Created on 7/25/2015
 */
public class ContentRepository extends BasicDAO<Content, String> {


    public ContentRepository(Morphia morphia, MongoClient mongo) {
        super(mongo, morphia, "test");
    }
//    private List<Content> contents = new ArrayList<Content>();
//
//    public List<Content> getContents() {
//        return contents;
//    }
//
//    public void setContents(List<Content> contents) {
//        this.contents = contents;
//    }
}
