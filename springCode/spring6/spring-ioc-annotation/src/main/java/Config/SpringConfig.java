package Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration//这是一个配置类
@ComponentScan("java")//开启组件扫描,java路径下的
public class SpringConfig {
}
