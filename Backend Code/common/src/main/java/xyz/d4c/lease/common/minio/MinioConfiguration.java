package xyz.d4c.lease.common.minio;

import io.minio.MinioClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MinioProperties.class)
@ConditionalOnProperty(name = "minio.endpoint")
public class MinioConfiguration {
    @Autowired
    private MinioProperties properties;

    @Bean
    public MinioClient minioClient(){
        return
                MinioClient.builder()
                .endpoint("http://192.168.6.101:9000")
                .credentials("minioadmin", "minioadmin")
                .build();
    }
}
