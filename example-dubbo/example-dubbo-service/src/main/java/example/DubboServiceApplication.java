package example;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by liyinhao on 18/7/17.
 */
@SpringBootApplication
@EnableDubboConfiguration
public class DubboServiceApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(DubboServiceApplication.class).run(args);
    }
}
