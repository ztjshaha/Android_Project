
#include <jni.h>  /* /usr/lib/jvm/java-1.7.0-openjdk-amd64/include/ */
#include <stdio.h>
#include <stdlib.h>
#include <android/log.h>

 
#if 0
typedef struct {
    char *name;          /* Java����õĺ����� */
    char *signature;    /* JNI�ֶ�������, ������ʾJava����õĺ����Ĳ����ͷ���ֵ���� */
    void *fnPtr;          /* C����ʵ�ֵı��غ��� */
} JNINativeMethod;
#endif

jint ledOpen(JNIEnv *env, jobject cls)
{
	__android_log_print(ANDROID_LOG_DEBUG,"LEDDemo","native ledOpen ..") ;
	return 0;
}

void ledClose(JNIEnv *env, jobject cls)
{
	__android_log_print(ANDROID_LOG_DEBUG,"LEDDemo","native ledClose ..") ;
}


jint ledCtrl(JNIEnv *env, jobject cls, jint which, jint status)
{
	__android_log_print(ANDROID_LOG_DEBUG,"LEDDemo","native ledCtrl : %d , %d",which,status) ;
	return 0;
}


static const JNINativeMethod methods[] = {
	{"ledOpen", "()I", (void *)ledOpen},
	{"ledClose", "()V", (void *)ledClose},
	{"ledCtrl", "(II)I", (void *)ledCtrl},
};




/* System.loadLibrary */
JNIEXPORT jint JNICALL
JNI_OnLoad(JavaVM *jvm, void *reserved)
{
	JNIEnv *env;
	jclass cls;

	if ((*jvm)->GetEnv(jvm, (void **)&env, JNI_VERSION_1_4)) {
		return JNI_ERR; /* JNI version not supported */
	}
	cls = (*env)->FindClass(env, "com/example/zt/hardlibrary/HardControl");
	if (cls == NULL) {
		return JNI_ERR;
	}

	/* 2. map java hello <-->c c_hello */
	if ((*env)->RegisterNatives(env, cls, methods, sizeof(methods)/sizeof(methods[0])) < 0)
		return JNI_ERR;

	return JNI_VERSION_1_4;
}

