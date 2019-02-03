package main.com.myblog.model.VO;

import java.io.Serializable;

/**
 * @author SquirrelChen
 */
public class UserSocial implements Serializable {

    private static final long serialVersionUID = -4904505243534775279L;

    private long socialId;
    private String socialName;
    private String socialUrl;

    public long getSocialId() {
        return socialId;
    }

    public void setSocialId(long socialId) {
        this.socialId = socialId;
    }

    public String getSocialName() {
        return socialName;
    }

    public void setSocialName(String socialName) {
        this.socialName = socialName;
    }

    public String getSocialUrl() {
        return socialUrl;
    }

    public void setSocialUrl(String socialUrl) {
        this.socialUrl = socialUrl;
    }

    @Override
    public String toString() {
        return "UserSocial{" +
                "socialId=" + socialId +
                ", socialName='" + socialName + '\'' +
                ", socialUrl='" + socialUrl + '\'' +
                '}';
    }
}
