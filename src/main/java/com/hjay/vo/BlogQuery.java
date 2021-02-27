package com.hjay.vo;

/**
 * @Author: HJAY
 * @Description: com.hjay.vo
 * @version: 1.0
 */
public class BlogQuery {
    /**
     * 标题
     */
    private String title;
    /**
     * 分类ID
     */
    private Long typeId;
    /**
     * 是否提交
     */
    private boolean recommend;

    public BlogQuery() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public boolean isRecommend() {
        return recommend;
    }

    public void setRecommend(boolean recommend) {
        this.recommend = recommend;
    }
}
