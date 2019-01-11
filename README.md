# Android_Project

一、Android驱动

1.第一个Android App

git remote add origin git@github.com:ztjshaha/Android_Project.git

git add -A

git commit -m "v1,created by android studio"

git tag v1



git push origin master

git push origin --tags

源码下载方法：

第一次

git clone https://github.com/ztjshaha/Android_Project.git

更新：

git pull origin

取出指定版本：

git checkout v1 //系统生成并添加button、checkbox

不足：未完成git方法的项目管理，后续需要补充，并完成。

二、Android app里访问C库：JNI

command:

1.通过交叉编译器，将C文件转换为静态链接库文件（*.so），并且通过安卓源码的静态库，添加C文件所需要包含的库，命令如下：

arm-linux-gcc -fPIC -shared hardcontrol.c -o libhardcontrol.so -I /usr/lib/jvm/java-1.7.0-openjdk-amd64/include/ -nostdlib /work/Android-5.0.2/android-5.0.2/prebuilts/ndk/9/platforms/android-19/arch-arm/usr/lib/libc.so

2.在源码进行静态库查找的方法：

首先切换到安卓源码目录下：

cd /work/Android-5.0.2/android-5.0.2

例如查找（libc.so）

find -name "libc.so"

不足：对于JNI的使用和理解。



