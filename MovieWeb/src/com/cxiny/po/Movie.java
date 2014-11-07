//这是一个model类  与goods表映射


package com.cxiny.po;

import java.util.Date;

public class Movie {
	
	private long id;
	private String name;
	private String intro;
	private String role ;
	private String photo;
	private String typeBanner;
	private String typeType;
	private String typeField;
	private String typeSuper;
	private Date uploadTime;
	private int clickNum;
	
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the intro
	 */
	public String getIntro() {
		return intro;
	}
	/**
	 * @param intro the intro to set
	 */
	public void setIntro(String intro) {
		this.intro = intro;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}
	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	/**
	 * @return the type1
	 */
	/**
	 * @return the typeBanner
	 */
	public String getTypeBanner() {
		return typeBanner;
	}
	/**
	 * @param typeBanner the typeBanner to set
	 */
	public void setTypeBanner(String typeBanner) {
		this.typeBanner = typeBanner;
	}
	/**
	 * @return the typeType
	 */
	public String getTypeType() {
		return typeType;
	}
	/**
	 * @param typeType the typeType to set
	 */
	public void setTypeType(String typeType) {
		this.typeType = typeType;
	}
	/**
	 * @return the typeField
	 */
	public String getTypeField() {
		return typeField;
	}
	/**
	 * @param typeField the typeField to set
	 */
	public void setTypeField(String typeField) {
		this.typeField = typeField;
	}
	/**
	 * @return the typeSuper
	 */
	public String getTypeSuper() {
		return typeSuper;
	}
	/**
	 * @param typeSuper the typeSuper to set
	 */
	public void setTypeSuper(String typeSuper) {
		this.typeSuper = typeSuper;
	}
	/**
	 * @return the uploadTime
	 */
	public Date getUploadTime() {
		return uploadTime;
	}
	/**
	 * @param uploadTime the uploadTime to set
	 */
	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}
	/**
	 * @return the clickNum
	 */
	public int getClickNum() {
		return clickNum;
	}
	/**
	 * @param clickNum the clickNum to set
	 */
	public void setClickNum(int clickNum) {
		this.clickNum = clickNum;
	}

	
}


