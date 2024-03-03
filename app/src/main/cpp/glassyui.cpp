#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_codecrunchersx_glassyui_MainActivity_getApiKeyFromNdk(JNIEnv *env, jobject thiz) {
    std::string apiKey = "W5u5ap4aPRYOdlbtT0hZmZFulVBiVIjSr8K9gtMcTQSxrUxmhJPR6WEY8nvtvITwoptAE1c6AI3Ls09";
    return env->NewStringUTF(apiKey.c_str());
}