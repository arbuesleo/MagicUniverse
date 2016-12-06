package com.leonardo.gomes.pojo;

public class ForeignNamePojo {
	String name;
	String imageUrl;
	String language;
	String multiverseid;
	public ForeignNamePojo(String name, String imageUrl, String language, String multiverseid) {
		super();
		this.name = name;
		this.imageUrl = imageUrl;
		this.language = language;
		this.multiverseid = multiverseid;
	}
	public ForeignNamePojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getMultiverseid() {
		return multiverseid;
	}
	public void setMultiverseid(String multiverseid) {
		this.multiverseid = multiverseid;
	}
	
}
