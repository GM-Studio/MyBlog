package main.com.myblog.model.VO;

import java.io.Serializable;

public class UserTag implements Serializable {

    private static final long serialVersionUID = 8094529914921779725L;
    private long tagId;
    private String tagName;

    public long getTagId() {
        return tagId;
    }

    public void setTagId(long tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "UserTag{" +
                "tagId=" + tagId +
                ", tagName='" + tagName + '\'' +
                '}';
    }
}
