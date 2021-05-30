package com.techone.instagramclone;

import java.util.ArrayList;

public class Section {
    private String sectionName;
    private ArrayList<SectionItems> sectionItems;

    public Section(String sectionName, ArrayList<SectionItems> sectionItems) {
        this.sectionName = sectionName;
        this.sectionItems = sectionItems;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public ArrayList<SectionItems> getSectionItems() {
        return sectionItems;
    }

    public void setSectionItems(ArrayList<SectionItems> sectionItems) {
        this.sectionItems = sectionItems;
    }

    @Override
    public String toString() {
        return "Section{" +
                "sectionName='" + sectionName + '\'' +
                ", sectionItems=" + sectionItems +
                '}';
    }
}
