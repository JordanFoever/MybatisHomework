package com.hxut.mybatis.pojo;


import java.sql.Timestamp;

public class Tbvideo {

  private long id;
  private String title;
  private String content;
  private String coverimg;
  private String videopath;
  private java.sql.Timestamp publishtime;
  private long lovecount;
  private long viewcount;
  private long ontop;
  private long duration;
  private long size;
  private long status;
  private String tags;
  private long cid;
  private long uid;

  public Tbvideo() {
  }
  public Tbvideo(int id) {
    this.id = id;
  }

  public Tbvideo(long id, String title, String content, String coverimg, String videopath, Timestamp publishtime, long lovecount, long viewcount, long ontop, long duration, long size, long status, String tags, long cid, long uid) {
    this.id = id;
    this.title = title;
    this.content = content;
    this.coverimg = coverimg;
    this.videopath = videopath;
    this.publishtime = publishtime;
    this.lovecount = lovecount;
    this.viewcount = viewcount;
    this.ontop = ontop;
    this.duration = duration;
    this.size = size;
    this.status = status;
    this.tags = tags;
    this.cid = cid;
    this.uid = uid;
  }

  @Override
  public String toString() {
    return "Tbvideo{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", content='" + content + '\'' +
            ", coverimg='" + coverimg + '\'' +
            ", videopath='" + videopath + '\'' +
            ", publishtime=" + publishtime +
            ", lovecount=" + lovecount +
            ", viewcount=" + viewcount +
            ", ontop=" + ontop +
            ", duration=" + duration +
            ", size=" + size +
            ", status=" + status +
            ", tags='" + tags + '\'' +
            ", cid=" + cid +
            ", uid=" + uid +
            '}';
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public String getCoverimg() {
    return coverimg;
  }

  public void setCoverimg(String coverimg) {
    this.coverimg = coverimg;
  }


  public String getVideopath() {
    return videopath;
  }

  public void setVideopath(String videopath) {
    this.videopath = videopath;
  }


  public java.sql.Timestamp getPublishtime() {
    return publishtime;
  }

  public void setPublishtime(java.sql.Timestamp publishtime) {
    this.publishtime = publishtime;
  }


  public long getLovecount() {
    return lovecount;
  }

  public void setLovecount(long lovecount) {
    this.lovecount = lovecount;
  }


  public long getViewcount() {
    return viewcount;
  }

  public void setViewcount(long viewcount) {
    this.viewcount = viewcount;
  }


  public long getOntop() {
    return ontop;
  }

  public void setOntop(long ontop) {
    this.ontop = ontop;
  }


  public long getDuration() {
    return duration;
  }

  public void setDuration(long duration) {
    this.duration = duration;
  }


  public long getSize() {
    return size;
  }

  public void setSize(long size) {
    this.size = size;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }


  public long getCid() {
    return cid;
  }

  public void setCid(long cid) {
    this.cid = cid;
  }


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }

}
