package content;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by hamid on 7/8/2015.
 */
public class Content {
    private String name;
    private Date date;
    private String text;
    private List<String> tags = new ArrayList<String>();
    private List<String> files = new ArrayList<String>();
    private String type;
    private List<String> comments = new ArrayList<String>();
    private List<Double> ratings = new ArrayList<Double>();
    private double averageRating;


    public void addTag(String keyword) {
    }


    public void change() {
        // TODO: use builder pattern
    }

    public void addRelationship(Content other, String type, String attribute) {
        // TODO: make it a service that interacts with database;
    }

    public void addComment() {

    }

    public void rate() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public List<Double> getRatings() {
        return ratings;
    }

    public void setRatings(List<Double> ratings) {
        this.ratings = ratings;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

}