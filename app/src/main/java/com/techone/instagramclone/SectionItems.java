package com.techone.instagramclone;

public class SectionItems {
    private String itemName;
    private int imageId;
    private int myImageid;
    public SectionItems(String itemName, int imageId,int myImageid) {
        this.itemName = itemName;
        this.imageId = imageId;
        this.myImageid=myImageid;
    }

    public SectionItems(String itemName, int imageId) {
        this.itemName = itemName;
        this.imageId = imageId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getMyImageid() {
        return myImageid;
    }

    public void setMyImageid(int myImageid) {
        this.myImageid = myImageid;
    }
}
