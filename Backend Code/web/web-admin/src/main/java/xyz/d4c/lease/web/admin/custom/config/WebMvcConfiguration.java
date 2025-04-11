package xyz.d4c.lease.web.admin.custom.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import xyz.d4c.lease.web.admin.custom.converter.StringToBaseEnumConverterFactory;
import xyz.d4c.lease.web.admin.custom.converter.StringToItemTypeConverter;
import xyz.d4c.lease.web.admin.custom.interceptor.AuthenticationInterceptor;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {
    @Autowired
//    private StringToItemTypeConverter stringToItemTypeConverter;
    StringToBaseEnumConverterFactory stringToItemTypeConverterFactory;

    @Autowired
    private AuthenticationInterceptor authenticationInterceptor;

    @Override
    public void addFormatters(FormatterRegistry registry) {
//        registry.addConverter(this.stringToItemTypeConverter);
        registry.addConverterFactory(stringToItemTypeConverterFactory);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry
                .addInterceptor(this.authenticationInterceptor)
                .addPathPatterns("/admin/**")
                .excludePathPatterns("/admin/login/**");
    }


}
