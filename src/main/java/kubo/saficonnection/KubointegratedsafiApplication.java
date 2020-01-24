package kubo.saficonnection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@EnableAspectJAutoProxy(proxyTargetClass=true)
@SpringBootApplication
public class KubointegratedsafiApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubointegratedsafiApplication.class, args);
	}

}
