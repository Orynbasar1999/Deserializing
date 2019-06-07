import com.google.gson.GsonBuilder;

import java.util.*;

/**
 * User: Sanzhar Aubakirov
 * Date: 1/7/16
 * <p>
 * This class is only for converting JSON to this class and to WebMessage
 */
public class Article {

    private String id;
    protected Date creationDate;
    protected Date lastChange;
    private Date date;
    private String title;
    private String url;
    private List<String> tags;
    private MessageType type;
    private String body;
    private Language lang;
    private CommentInfo commentInfo;
    private String newsPortalName;
    private String summary;
    /**
     * Order of regions is important. First should be most urgent
     */
    private LinkedHashSet<Region> region = new LinkedHashSet<Region>();

    public Article() {
        creationDate = (creationDate == null) ? new Date() : creationDate;
        lastChange = (lastChange == null) ? creationDate : new Date();
    }

    public Article(Region... cRegion) {
        this();
        getRegion().addAll(Arrays.asList(cRegion));
    }

    public Article(String id, Date creationDate, Date lastChange, Date date, String title, String url, List<String> tags,
                   MessageType type, String body, Language lang, CommentInfo commentInfo,
                   String newsPortalName, LinkedHashSet<Region> region) {
        this.id = id;
        this.creationDate = creationDate;
        this.lastChange = lastChange;
        this.date = date;
        this.title = title;
        this.url = url;
        this.tags = tags;
        this.type = type;
        this.body = body;
        this.lang = lang;
        this.commentInfo = commentInfo;
        this.newsPortalName = newsPortalName;
        this.region = region;
    }

    @Override
    public String toString() {
        return "\n\tNew message:" +
                "\n\turl = " + getUrl() +
                "\n\tTitle = " + getTitle() +
                "\n\tType = " + getType().name() +
                "\n\tTAGs = " + new GsonBuilder().setPrettyPrinting().create().toJson(getTags());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastChange() {
        return lastChange;
    }

    public void setLastChange(Date lastChange) {
        this.lastChange = lastChange;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Language getLang() {
        return lang;
    }

    public void setLang(Language lang) {
        this.lang = lang;
    }

    public CommentInfo getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(CommentInfo commentInfo) {
        this.commentInfo = commentInfo;
    }

    public String getNewsPortalName() {
        return newsPortalName;
    }

    public void setNewsPortalName(String newsPortalName) {
        this.newsPortalName = newsPortalName;
    }

    public LinkedHashSet<Region> getRegion() {
        return region;
    }

    public void setRegion(LinkedHashSet<Region> region) {
        this.region = region;
    }

    public void addRegion(Region region){
        this.region.add(region);
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
