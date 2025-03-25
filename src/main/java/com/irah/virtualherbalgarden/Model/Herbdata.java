package com.irah.virtualherbalgarden.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Herbdata {
	@Id
	private int id;

	private String name;
	private String sciname;
	private String benifits;
	private String imgurl;
	private String modelurl;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSciname() {
		return sciname;
	}

	public void setSciname(String sciname) {
		this.sciname = sciname;
	}

	public String getBenifits() {
		return benifits;
	}

	public void setBenifits(String benifits) {
		this.benifits = benifits;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public String getModelurl() {
		return modelurl;
	}

	public void setModelurl(String modelurl) {
		this.modelurl = modelurl;
	}

	@Override
	public String toString() {
		return "Herbdata [id=" + id + ", name=" + name + ", sciname=" + sciname + ", benifits=" + benifits + ", imgurl="
				+ imgurl + ", modelurl=" + modelurl + "]";
	}

}
