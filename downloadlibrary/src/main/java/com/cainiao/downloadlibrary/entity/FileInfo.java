package com.cainiao.downloadlibrary.entity;

import java.io.Serializable;

/**
 * Created by tliang on 2017/8/22.
 * 功能描述：封装所下载文件的信息，将FileInfo序列化，可用于Intent传递对象
 */

public class FileInfo implements Serializable {
    private int id;//文件的ID
    private String url;//文件的下载地址
    private String fileName;//文件的名字
    private int length;//文件的总大小
    private int finished;//文件已经完成了多少

    public FileInfo() {
        super();
    }

    /**
     * @param id        文件的id
     * @param url       文件的下载地址
     * @param fileName  文件的名字
     * @param length    文件的总大小
     * @param finished  文件已经完成了多少
     */
    public FileInfo(int id, String url, String fileName, int length, int finished) {
        this.id = id;
        this.url = url;
        this.fileName = fileName;
        this.length = length;
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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getFinished() {
        return finished;
    }

    public void setFinished(int finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "FileInfo [id=" + id + ", url=" + url + ", fileName=" + fileName + ", length=" + length + ", finished="
                + finished + "]";
    }
}
