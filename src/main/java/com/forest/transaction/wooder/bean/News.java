package com.forest.transaction.wooder.bean;

import java.io.Serializable;

public class News implements Serializable
{
	private static final long serialVersionUID = 3502822987971890283L;
	
	private int id;
	private String content;
	private Meta meta;
	private Image image;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getContent()
	{
		return content;
	}
	public void setContent(String content)
	{
		this.content = content;
	}
	public Meta getMeta()
	{
		return meta;
	}
	public void setMeta(Meta meta)
	{
		this.meta = meta;
	}
	public Image getImage()
	{
		return image;
	}
	public void setImage(Image image)
	{
		this.image = image;
	}
	
}
