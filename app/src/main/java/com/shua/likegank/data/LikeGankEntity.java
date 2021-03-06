package com.shua.likegank.data;

import java.util.List;

/**
 * LikeGank CommonBody
 * Created by SHUA on 2017/3/6.
 */

public class LikeGankEntity {

    /**
     * _id : 58e59282421aa90d6f211e38
     * createdAt : 2017-04-06T08:57:38.454Z
     * desc : 敲酷炫的ViewPager切换效果和Q弹指示器
     * publishedAt : 2017-04-06T12:06:10.17Z
     * source : web
     * type : Android
     * url : http://blog.csdn.net/qian520ao/article/details/68952079
     * used : true
     * who : null
     * images : ["http://img.gank.io/1488810b-04fe-431a-a77f-e3423a6a3d17","http://img.gank.io/b02e1427-0551-471b-b61c-871fe2a23082"]
     */

    private String _id;
    private String createdAt;
    private String desc;
    private String publishedAt;
    private String source;
    private String type;
    private String url;
    private boolean used;
    private String who;
    private List<String> images;

    public String get_id() {
        return _id;
    }

    public String getDesc() {
        return desc;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWho() {
        return who;
    }
}
