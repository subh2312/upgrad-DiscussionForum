package entity;

public class Questions extends AbstractEntity {

    private String subject;
    private String description;
    private User user;
    private int upVoteCount = 0;
    private static long lastEntry=0L;

    @Override
    void autoGenerateId() {
        lastEntry=lastEntry+1;
        super.setId(lastEntry);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getUpVoteCount() {
        return upVoteCount;
    }

    public void setUpVoteCount(int upVoteCount) {
        this.upVoteCount = upVoteCount;
    }

    public  long getLastEntry() {
        return lastEntry;
    }

    public  void setLastEntry(long lastEntry) {
        this.lastEntry = lastEntry;
    }

    public void increaseUpvoteCount(){
        this.upVoteCount=this.upVoteCount+1;
    }

}
