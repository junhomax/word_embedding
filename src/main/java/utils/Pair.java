package utils;

/**
 * Created by junhomax on 2017-11-08.
 */
public class Pair< L, R > {
    private L left;
    private R right;

    public Pair( L newL, R newR ) {
        this.left   = newL;
        this.right  = newR;
    }


    public L getFirst() {
        return left;
    }


    public R getSecond() {
        return right;
    }


    public void setFirst( L first ) {
        this.left = first;
    }

    public void setSecond( R second ) {
        this.right = second;
    }
}
