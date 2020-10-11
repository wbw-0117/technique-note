# jsoncat Guide哥 模仿spring boot轻量级http框架
### git地址 https://gitee.com/SnailClimb/jsoncat

# gradle构
## build.gradle 与 settings.gradle
uild.gradle - 文件包含项目构建所使用的脚本。  
settings.gradle - 文件将包含必要的一些设置，例如，任务或项目之间的依懒关系等

>rootProject.name = 'project-root'   //平台根  
include ':project-core'  //包含子系统以及模块   


### 启动大体步骤
1.打印banner图  
2.创建ApplicationContext  
3.扫描指定包名、反射加载类映射关系、装在bean、为auto wired注入属性  
4.创建socket启动、绑定端口、扩展spi SimpleChannelInboundHandler、执行动态容器调用处理请求、response响应输出

### 总结
启动时扫描加载指定注解，存入集合容器中，在channel接收时，根据访问请求方式、url的动态调用对应匹配方法，并处理返回值

## gradle 编译乱码
在build.gradle 引入  
`tasks.withType(JavaCompile) {
     options.encoding = "UTF-8"
 }`