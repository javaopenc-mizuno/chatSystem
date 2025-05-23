package com.example.chatsystem.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Chat {

    
    private Integer id;

    private String name;

    private String comment;

    // --- getter & setter ---

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

	public Object findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}
