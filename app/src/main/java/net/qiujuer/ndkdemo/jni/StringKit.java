package net.qiujuer.ndkdemo.jni;

/**
 * Created by QiuJuer
 * on 2014/12/20.
 */
public class StringKit {
    public static native void setNull(String str);
    static {
        System.loadLibrary("JniDemo");
    }
}
