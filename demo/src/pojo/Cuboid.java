package pojo;

import java.io.Serializable;

public class Cuboid implements Serializable {

    private static final long serialVersionUID = 1L;

    public Cuboid() {}

    public Cuboid(String id, String name, int length, int width, int height) {
        this.id = id;
        this.name = name;
        this.length = length;
        this.height = height;
        this.width = width;
    }

    String id;
    String name;
    int length;
    int height;
    int width;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
