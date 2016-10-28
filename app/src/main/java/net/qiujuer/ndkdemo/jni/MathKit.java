package net.qiujuer.ndkdemo.jni;

/**
 * Created by Qiujuer
 * on 2014/12/20.
 */
public class MathKit {
    public static native int square(int num);

    static {
        System.loadLibrary("JniDemo");
    }
}
