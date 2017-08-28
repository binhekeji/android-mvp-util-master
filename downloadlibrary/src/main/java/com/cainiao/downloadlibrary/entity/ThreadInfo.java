package com.cainiao.downloadlibrary.entity;

/**
 * Created by tliang on 2017/8/23.
 * 功能描述：线程信息类，封装线程的ID，线程的url，线程开始位置，结束位置，以及已经完成的位置
 */

public class ThreadInfo {
    private int id;       //线程id
    private String url;   //文件的下载地址
    private int start;    //线程下载的开始位置
    private int end;      //线程下载的结束位置
    private int finished; //线程下载的完成位置

    public ThreadInfo() {
        super();
    }

    /**
     *
     * @param id       线程id
     * @param url      文件的下载地址
     * @param start    线程下载的开始位置
     * @param end      线程下载的结束位置
     * @param finished 线程下载的完成位置
     */
    public ThreadInfo(int id, String url, int start, int end, int finished) {
        super();
        this.id = id;
        this.url = url;
        this.start = start;
        this.end = end;
        this.finished = finished;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getFinished() {
        return finished;
    }

    public void setFinished(int finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "ThreadInfo [id=" + id + ", url=" + url + ", start=" + start + ", end=" + end + ", finished=" + finished
                + "]";
    }
}
