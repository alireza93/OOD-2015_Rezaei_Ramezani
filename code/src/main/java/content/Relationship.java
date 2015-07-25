package content;

/**
 * @author Hamid Ramazani (mrramazani@gmail.com)
 *         Created on 7/21/2015
 */
public class Relationship {
    private Content firstContent;
    private Content secondContent;
    private String type;
    private String attribute;

    public Relationship(Content firstContent, Content secondContent, String type, String attribute) {
        this.firstContent = firstContent;
        this.secondContent = secondContent;
        this.type = type;
        this.attribute = attribute;
    }

    public Content getFirstContent() {
        return firstContent;
    }

    public void setFirstContent(Content firstContent) {
        this.firstContent = firstContent;
    }

    public Content getSecondContent() {
        return secondContent;
    }

    public void setSecondContent(Content secondContent) {
        this.secondContent = secondContent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}
