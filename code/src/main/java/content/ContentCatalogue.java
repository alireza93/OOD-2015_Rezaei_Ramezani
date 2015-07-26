package content;

import abstractCatalogue.AbstractCatalogue;
import repository.ContentRepository;

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
