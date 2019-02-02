package main.com.myblog.model.VO;

import java.io.Serializable;

public class UserTag implements Serializable {

    private static final long serialVersionUID = 8094529914921779725L;
    private long tag_id;
    private String tag_name;

    public long getTag_id() {
        return tag_id;
    }

    public void setTag_id(long tag_id) {
        this.tag_id = tag_id;
    }

    public String getTag_name() {
        return tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }
}
