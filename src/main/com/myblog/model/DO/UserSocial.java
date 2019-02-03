package main.com.myblog.model.DO;

import java.io.Serializable;
import java.util.Date;

/**
 * @author SquirrelChen
 */
public class UserSocial implements Serializable {

    private static final long serialVersionUID = -470343388772708510L;

    private long socialId;
    private long socialUserId;
    private String socialName;
    private String socialUrl;

    public String getSocialUrl() {
        return socialUrl;
    }

    public void setSocialUrl(String socialUrl) {
        this.socialUrl = socialUrl;
    }

    private Date socialCreateTime;
    private Date socialUpdateTime;

    public long getSocialId() {
        return socialId;
    }

    public void setSocialId(long socialId) {
        this.socialId = socialId;
    }

    public long getSocialUserId() {
        return socialUserId;
    }

    public void setSocialUserId(long socialUserId) {
        this.socialUserId = socialUserId;
    }

    public String getSocialName() {
        return socialName;
    }

    public void setSocialName(String socialName) {
        this.socialName = socialName;
    }

    public Date getSocialCreateTime() {
        return socialCreateTime;
    }

    public void setSocialCreateTime(Date socialCreateTime) {
        this.socialCreateTime = socialCreateTime;
    }

    public Date getSocialUpdateTime() {
        return socialUpdateTime;
    }

    public void setSocialUpdateTime(Date socialUpdateTime) {
        this.socialUpdateTime = socialUpdateTime;
    }

    @Override
    public String toString() {
        return "UserSocial{" +
                "socialId=" + socialId +
                ", socialUserId=" + socialUserId +
                ", socialName='" + socialName + '\'' +
                ", socialUrl='" + socialUrl + '\'' +
                ", socialCreateTime=" + socialCreateTime +
                ", socialUpdateTime=" + socialUpdateTime +
                '}';
    }
}
