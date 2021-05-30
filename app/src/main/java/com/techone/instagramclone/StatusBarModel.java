package com.techone.instagramclone;

public class StatusBarModel {

private int profileId;
private  String profileName;

    public StatusBarModel(int profileId, String profileName) {
        this.profileId = profileId;
        this.profileName = profileName;
    }

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }
}
