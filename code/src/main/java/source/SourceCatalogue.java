package source;

import abstractCatalogue.AbstractCatalogue;
import repository.SourceRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hamid Ramazani (mrramazani@gmail.com)
 *         Created on 7/27/2015
 */
public class SourceCatalogue extends AbstractCatalogue{
    private List<Source> sources = new ArrayList<Source>();
    private SourceRepository sourceRepository;

    public SourceCatalogue() {
        super();
        sourceRepository = new SourceRepository(this.getMongoClient(), this.getMorphia(), "test");
    }

    public List<Source> list() {
        return sourceRepository.find().asList();
    }

    public void add(Source src) {
        sourceRepository.save(src);
    }

    public void delete(Source src) {
        sourceRepository.delete(src);
    }

    public List<Source> search(String keyword) {
        return sourceRepository.findByName(keyword);
    }

}