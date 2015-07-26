package content;

import abstractCatalogue.AbstractCatalogue;
import com.mongodb.MongoClient;
import org.mongodb.morphia.Morphia;
import repository.ContentRepository;
import user.User;

import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Hamid Ramazani (mrramazani@gmail.com)
 *         Created on 7/23/2015
 */
public class ContentCatalogue extends AbstractCatalogue {

    private ContentRepository contentRepository;

    public ContentCatalogue() {
        super();
        contentRepository = new ContentRepository(super.getMorphia(), super.getMongoClient());
    }

    public void addContent(Content content) {
        contentRepository.save(content);
    }


}
