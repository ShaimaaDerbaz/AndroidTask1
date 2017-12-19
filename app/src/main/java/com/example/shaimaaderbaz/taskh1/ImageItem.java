package com.example.shaimaaderbaz.taskh1;

/**
 * Created by Shaimaa Derbaz on 12/12/2017.
 */

public class ImageItem {
    int image ;
    int id;

    public ImageItem(int image, int id) {
        this.image = image;
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
