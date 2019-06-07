/**
 * Created by admin230 on 5/21/16.
 */
public class CommentInfo {

    private int commentNumber = 0;
    private long timeStamp;
    private String commentsMD5 = "";

    public CommentInfo() {
    }

    public CommentInfo(int commentNumber, long timeStamp, String commentsMD5) {
        this.commentNumber = commentNumber;
        this.timeStamp = timeStamp;
        this.commentsMD5 = commentsMD5;
    }

    public int getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(int commentNumber) {
        this.commentNumber = commentNumber;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getCommentsMD5() {
        return commentsMD5;
    }

    public void setCommentsMD5(String commentsMD5) {
        this.commentsMD5 = commentsMD5;
    }
}
