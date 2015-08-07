package imooc.com.commonadapter.Bean;

/**
 * Created by Huhu on 8/7/15.
 */

public class Bean {
    public String word;
    public int imageId;

    public Bean(String word, int imageId) {
        this.imageId = imageId;
        this.word = word;
    }

    public String getWord() {

        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
