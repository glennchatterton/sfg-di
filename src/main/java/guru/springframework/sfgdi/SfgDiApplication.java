package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ContextController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		//get bean gets instance from container.
		ContextController contextController = (ContextController) ctx.getBean("contextController");
		System.out.println("Got Context, got bean!");
		String text = contextController.printText();
		System.out.println(text);

	}

}
