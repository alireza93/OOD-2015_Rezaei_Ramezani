package content;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Morphia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ContentRepository;

/**
 * @author Hamid Ramazani (mrramazani@gmail.com)
 *         Created on 7/23/2015
 */
public class ContentCatalogue {

    private ContentRepository contentRepository;

    public ContentCatalogue(MongoClient mongoClient, Morphia morphia) {
        contentRepository = new ContentRepository(morphia, mongoClient);
    }

    public void addContent(Content content) {
        contentRepository.save(content);
    }
}
