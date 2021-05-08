package org.phoenix.interview.ctci.objectorienteddesign.FileSystem;

/**
 * Entry can be a File or Directory
 * This class will contain the structure for both
 */
public abstract class Entry {
    // parent can be of Directory type only
    private final Directory parent;
    private final long createdAt;
    private final long lastUpdatedAt;
    private final long lastAccessedAt;
    // Name of Directory or File
    private String name;

    public Entry(String name, Directory parent) {
        this.name = name;
        this.parent = parent;
        this.createdAt = System.currentTimeMillis();
        this.lastUpdatedAt = System.currentTimeMillis();
        this.lastAccessedAt = System.currentTimeMillis();
    }

    // Method returns size of Entry object.
    public abstract int size();

    // Deletes the current entry
    public boolean delete() {
        if (parent == null) {
            return false;
        }
        return parent.deleteEntry(this);
    }

    // Changes the name of the Entry Object
    public void changeName(String name) {
        this.name = name;
    }

    // Return the full path
    public String getFullPath() {
        if (parent == null) {
            return this.name;
        }
        return (parent.getFullPath() + "/" + name).replaceAll("//", "/");
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public long getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public long getLastAccessedAt() {
        return lastAccessedAt;
    }

    public String getName() {
        return name;
    }
}
