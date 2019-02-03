package main.com.myblog.model.VO;

import java.io.Serializable;
import java.util.List;

/**
 * @author SquirrelChen
 */
public class User implements Serializable {

    private static final long serialVersionUID = 4488803431001477959L;

    private long userId;
    private String userName;
    private String userDesc;
    private String userImgUrl;
    private List<UserTag> userTags;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public String getUserImgUrl() {
        return userImgUrl;
    }

    public void setUserImgUrl(String userImgUrl) {
        this.userImgUrl = userImgUrl;
    }

    public List<UserTag> getUserTags() {
        return userTags;
    }

    public void setUserTags(List<UserTag> userTags) {
        this.userTags = userTags;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userDesc='" + userDesc + '\'' +
                ", userImgUrl='" + userImgUrl + '\'' +
                ", userTags=" + userTags.toString() +
                '}';
    }
}
