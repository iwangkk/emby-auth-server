# 指定基础镜像
FROM docker.m.daocloud.io/openjdk:8-jdk-alpine

# 在镜像中执行命令,创建目录，并使用它作为工作目录
RUN mkdir -p /app
# 设置工作目录，即后续命令的默认执行路径
WORKDIR /app
# 复制文件或目录到镜像中。可以将本地文件或目录复制到镜像的指定位置。
COPY target/emby-auth-server.jar /app/app.jar

# 设置环境变量
# 指定容器的时区
ENV TZ=Asia/Shanghai
# 用于配置 Java 虚拟机的选项，如初始堆大小、最大堆大小和随机数生成器，可通过 docker run -e "JAVA_OPTS=" 进行覆盖
ENV JAVA_OPTS="-Xms32m -Xmx128m "
## 应用参数 默认 server.port=8081 可自行修改
ENV ARGS=""

# 定义容器启动后执行的命令,启动后端项目
CMD java ${JAVA_OPTS} -jar app.jar $ARGS
# 声明要监听的端口
EXPOSE 8081