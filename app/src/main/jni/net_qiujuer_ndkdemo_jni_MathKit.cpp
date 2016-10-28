#include <net_qiujuer_ndkdemo_jni_MathKit.h>

JNIEXPORT jint JNICALL Java_net_qiujuer_ndkdemo_jni_MathKit_square
  (JNIEnv *env, jclass cls, jint num)
  {
        return num*num;
  }
