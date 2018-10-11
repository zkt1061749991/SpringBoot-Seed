package com.xuanxuan.csu.model;

import javax.persistence.*;

public class Ask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String content;

    @Column(name = "belong_user")
    private Integer belongUser;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return belong_user
     */
    public Integer getBelongUser() {
        return belongUser;
    }

    /**
     * @param belongUser
     */
    public void setBelongUser(Integer belongUser) {
        this.belongUser = belongUser;
    }
}