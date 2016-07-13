package com.forest.transaction.wooder.bean;

import java.io.Serializable;
import java.util.ArrayList;


public class Meta implements Serializable
{
	private static final long serialVersionUID = 4521908915454939276L;
	
	private String siteName; // 站点名称
	private String siteHost; // 站点域名
	private String title; // 页面标题
	private ArrayList<String> keywords; // 关键词
	private String pubtime; // 发布时间
	private String organization; // 机构
	private String writer; // 作者
	private String editor; // 编辑
	private String summary; // 摘要
	public String getSiteName()
	{
		return siteName;
	}
	public void setSiteName(String siteName)
	{
		this.siteName = siteName;
	}
	public String getSiteHost()
	{
		return siteHost;
	}
	public void setSiteHost(String siteHost)
	{
		this.siteHost = siteHost;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public ArrayList<String> getKeywords()
	{
		return keywords;
	}
	public void setKeywords(ArrayList<String> keywords)
	{
		this.keywords = keywords;
	}
	public String getPubtime()
	{
		return pubtime;
	}
	public void setPubtime(String pubtime)
	{
		this.pubtime = pubtime;
	}
	public String getOrganization()
	{
		return organization;
	}
	public void setOrganization(String organization)
	{
		this.organization = organization;
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
	public String getSummary()
	{
		return summary;
	}
	public void setSummary(String summary)
	{
		this.summary = summary;
	}
}
