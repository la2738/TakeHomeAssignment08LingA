package com.example.android.takehomeassignment08_linga;

public class Project {
    public int name;
    public int level;
    public int time;
    public int tool;
    public int photoId;
    public boolean isTrue;

    public Project(int name, int level, int time, int tool, int photoId, boolean isTrue) {
        this.name = name;
        this.level = level;
        this.time = time;
        this.tool = tool;
        this.photoId = photoId;
        this.isTrue = isTrue;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTool() {
        return tool;
    }

    public void setTool(int tool) {
        this.tool = tool;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }
}


