# auto-fill 自动填报疫情通
clone 到一个地方，比如 /usr 下
```
git clone https://github.com/Balababaa/auto-fill.git
```
编译一下 AutoFill.java，增加 run.sh 的权限
```
javac -classpath "okhttp-3.7.0.jar:okio-1.12.0.jar" AutoFill.java
chmod 777 run.sh
```
添加到 crontab 的任务里去
```
crontab -e
0 6 * * * sh /usr/auto-fill/run.sh <学号> <密码>
```
