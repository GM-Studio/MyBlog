package main.com.myblog.model.DO;

import java.io.Serializable;
import java.util.Date;

public class UserTag implements Serializable {

    private static final long serialVersionUID = -8940189688626047020L;
    private long tag_id;
    private String tag_name;
    private long tag_user_id;
    private Date tag_create_time;
    private Date tag_update_time;

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

    public long getTag_user_id() {
        return tag_user_id;
    }

    public void setTag_user_id(long tag_user_id) {
        this.tag_user_id = tag_user_id;
    }

    public Date getTag_create_time() {
        return tag_create_time;
    }

    public void setTag_create_time(Date tag_create_time) {
        this.tag_create_time = tag_create_time;
    }

    public Date getTag_update_time() {
        return tag_update_time;
    }

    public void setTag_update_time(Date tag_update_time) {
        this.tag_update_time = tag_update_time;
    }
}
