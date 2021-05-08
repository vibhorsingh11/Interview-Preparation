package org.phoenix.interview.ctci.objectorienteddesign.FileSystem;

public class File extends Entry {
    private final int size;
    private String content;

    public File(String name, Directory parent, int size) {
        super(name, parent);
        this.size = size;
    }

    // Returns the size of current Directly
    public int size() {
        return size;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
