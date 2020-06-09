package cn.ickck.environmental.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DruidConfig {



    @Bean(name = "default_DataSource")
    @ConfigurationProperties(prefix ="spring.datasource")
    public DataSource druidDataSource()
    {
        return new DruidDataSource();
    }


    @Bean
    public ServletRegistrationBean<StatViewServlet> statViewServlet() {
        ServletRegistrationBean<StatViewServlet> registrationBean = new ServletRegistrationBean<>();
        registrationBean.setServlet(new StatViewServlet());
        registrationBean.setUrlMappings(Collections.singletonList("/druid/*"));
        //设置初始化参数
        Map<String, String> initMap = new HashMap<>();
        // 登录账户密码
        initMap.put("loginUsername", "root");
        initMap.put("loginPassword", "123456");
        initMap.put("allow", "");
        initMap.put("deny", "");
        registrationBean.setInitParameters(initMap);
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean<WebStatFilter> webStatFilter() {
        FilterRegistrationBean<WebStatFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new WebStatFilter());
        registrationBean.setUrlPatterns(Collections.singletonList("/*"));
        //设置初始化参数
        Map<String, String> initMap = new HashMap<>(1);
        initMap.put("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        registrationBean.setInitParameters(initMap);
        return registrationBean;
    }
}


