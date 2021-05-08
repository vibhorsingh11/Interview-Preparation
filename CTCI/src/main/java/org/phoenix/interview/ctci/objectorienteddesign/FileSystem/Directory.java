package org.phoenix.interview.ctci.objectorienteddesign.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private final List<Entry> contents;

    public Directory(String name, Directory parent) {
        super(name, parent);
        this.contents = new ArrayList<>();
    }

    // Abstract method from Entry class
    // Returns the size of current Directly
    public int size() {
        int size = 0;
        for (Entry e : contents) {
            size += e.size();
        }
        return size;
    }

    public int numberOfFiles() {
        int count = 0;
        for (Entry e : contents) {
            if (e instanceof Directory directory) {
                count++;
                count += directory.numberOfFiles();
            } else if (e instanceof File) {
                count++;
            }
        }
        return count;
    }

    public boolean deleteEntry(Entry entry) {
        return contents.remove(entry);
    }

    public void addEntry(Entry entry) {
        contents.add(entry);
    }

    public List<Entry> getContents() {
        return contents;
    }
}
