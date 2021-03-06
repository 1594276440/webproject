package com.demo.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
public class WebMvcConfig {
	 // 保存上传文件的目录
    public final static String FILE_DIR = "D:/book/upload/";
    
    /**
     * 配置静态资源的web访问路径，例如上传的文件 abc.png 保存在 D:/book/upload 下
     * 那么在浏览器中访问的路径为：http://localhost:8080/upload/abc.png
     */
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upload/**").addResourceLocations(
                "file:///" + WebMvcConfig.FILE_DIR);
    }
}
