package demo;

;
/**
 * @ClassName SpringBootApplication
 * @Auther kaifengliu
 * @DATE 2025/4/9 14:37
 **/
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("demo.utils.dao")
@SpringBootApplication
public class SpringBootDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
}
