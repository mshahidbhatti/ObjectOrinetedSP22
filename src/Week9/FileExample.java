package Week9;

import java.io.Serializable;
import java.util.Comparator;

public class FileExample implements MusicPlayer, Serializable, Cloneable, Comparable, Comparator {

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }
}
