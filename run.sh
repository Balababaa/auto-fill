javac -classpath "okhttp-3.7.0.jar:okio-1.12.0.jar" AutoFill.java
java -classpath ".:okhttp-3.7.0.jar:okio-1.12.0.jar" AutoFill $1 $2
