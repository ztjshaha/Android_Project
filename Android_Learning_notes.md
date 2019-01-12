一、Android驱动 （2019/1/10）

【进行过一系列准备工作】

1.第一个Android App

1.学习Button和Checkbox

​	首先，在编写APP的时候，我们应该先画出结构，然后再进行规划、Layout，最后我们才能编写出合理的APP。

在学习Button和Checkbox的时候，我们需要使用快捷键SHIFT+F1(Fn)/Ctrl+Q,后打开插件的Doc。

二、Android app里访问C库：JNI （2019/1/11）

1.学习到了我们怎么使用JNI库，还需要进一步的理解。

总结：通过本章课程，在安卓学习中，我们在调试的使用通过Logcat查看调试信息。今天通过github完成了，初步的项目上传，版本管理和私有仓库的创建。

不足建议：后续学习继续，但是最主要的还是github上面项目管理，需要进一步学习落实。



三、对于Github项目管理（2019/1/12）

在对10号和11号项目进行，Git版本，标签，上传，分支进行管理的时候出现了，上传项目（有文件夹并没有里面文件）。

问题：不能进行git管理，发生冲突。文件夹里面文件不能上传，提示+-subproject，error上传接收。

tree:Android_Project/APP_0001_LEDDemo/*

原因：由于在我们的Github Desk管理在Android_Project目录，而Git Bash在APP_0001_LEDDemo目录下面生成了（.git文件夹（隐藏文件夹）和.gitignore文件），导致不能管理。

解决办法：根据网友推荐删除（.git和.gitignore），但是我进行过这个操作不行，所以重新建立了工程，进行了项目添加并管理。因为我根本不太熟悉Git。所以后面还有待继续观察原因。推测是分支管理出现了问题，建议买一本Git书籍进行原因分析。