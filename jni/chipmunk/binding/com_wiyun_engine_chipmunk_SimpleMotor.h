/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_wiyun_engine_chipmunk_SimpleMotor */

#ifndef _Included_com_wiyun_engine_chipmunk_SimpleMotor
#define _Included_com_wiyun_engine_chipmunk_SimpleMotor
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_wiyun_engine_chipmunk_SimpleMotor
 * Method:    init
 * Signature: (Lcom/wiyun/engine/chipmunk/Body;Lcom/wiyun/engine/chipmunk/Body;F)V
 */
JNIEXPORT void JNICALL Java_com_wiyun_engine_chipmunk_SimpleMotor_init
  (JNIEnv *, jobject, jobject, jobject, jfloat);

/*
 * Class:     com_wiyun_engine_chipmunk_SimpleMotor
 * Method:    setRate
 * Signature: (F)V
 */
JNIEXPORT void JNICALL Java_com_wiyun_engine_chipmunk_SimpleMotor_setRate
  (JNIEnv *, jobject, jfloat);

/*
 * Class:     com_wiyun_engine_chipmunk_SimpleMotor
 * Method:    getRate
 * Signature: ()F
 */
JNIEXPORT jfloat JNICALL Java_com_wiyun_engine_chipmunk_SimpleMotor_getRate
  (JNIEnv *, jobject);

#ifdef __cplusplus
}
#endif
#endif
