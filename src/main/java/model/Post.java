package model;

import java.util.List;

/**
 * @Author Cruise
 * @Date 2016-11-08 22:01
 */
public class Post {

    private String title;

    private List<String> images;

    private String downloadLink;

    private String downloadPwd;

    private String description;

    private String size;

    private String pixel;

    public String getPixel() {
        return pixel;
    }

    public void setPixel(String pixel) {
        this.pixel = pixel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public String getDownloadPwd() {
        return downloadPwd;
    }

    public void setDownloadPwd(String downloadPwd) {
        this.downloadPwd = downloadPwd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
