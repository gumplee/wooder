package com.forest.transaction.wooder.bean;

import java.io.Serializable;

public class Image implements Serializable
{
	private static final long serialVersionUID = 4533408356162822816L;
	
	private String title; // 图片标题
	private String src; // 图片地址
	private String thumbnail; // 缩略图地址
	private String href; // 图片链接地址
	private String desc; // 图片描述
	private String date; // 图片时间
	private String writer; // 图片作者
	private String editor; // 图片编辑
	private String source; // 来源
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getSrc()
	{
		return src;
	}
	public void setSrc(String src)
	{
		this.src = src;
	}
	public String getThumbnail()
	{
		return thumbnail;
	}
	public void setThumbnail(String thumbnail)
	{
		this.thumbnail = thumbnail;
	}
	public String getHref()
	{
		return href;
	}
	public void setHref(String href)
	{
		this.href = href;
	}
	public String getDesc()
	{
		return desc;
	}
	public void setDesc(String desc)
	{
		this.desc = desc;
	}
	public String getDate()
	{
		return date;
	}
	public void setDate(String date)
	{
		this.date = date;
	}
	public String getWriter()
	{
		return writer;
	}
	public void setWriter(String writer)
	{
		this.writer = writer;
	}
	public String getEditor()
	{
		return editor;
	}
	public void setEditor(String editor)
	{
		this.editor = editor;
	}
	public String getSource()
	{
		return source;
	}
	public void setSource(String source)
	{
		this.source = source;
	}
	
}
