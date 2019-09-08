package com.xzy.mybatis.pojo;

public class Comments {
    @Override
	public String toString() {
		return "Comments [id=" + id + ", type=" + type + ", area=" + area + ", author=" + author + ", comment="
				+ comment + "]";
	}

	private Integer id;

    private String type;

    private String area;

    private String author;

    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}