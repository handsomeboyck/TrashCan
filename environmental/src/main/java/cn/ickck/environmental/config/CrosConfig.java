package cn.ickck.environmental.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @ClassName CrosConfig
 * @Description TODO
 * @Author ck  设置允许跨域访问
 * @Date 2020/1/9 22:30
 * @Version 1.0
 **/
@Configuration
public class CrosConfig extends WebMvcConfigurerAdapter {




    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedHeaders("*")
                .allowedOrigins("*")
                .allowedMethods("*");

    }
}