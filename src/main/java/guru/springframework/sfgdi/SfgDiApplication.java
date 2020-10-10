package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConfigurationController;
import guru.springframework.sfgdi.controllers.GreetingController;
import guru.springframework.sfgdi.datasources.FakeDataSource;
import guru.springframework.sfgdi.datasources.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"components","guru.springframework.sfgdi"})
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());
		System.out.println(fakeDataSource.getAppDefauklt());

		FakeJmsBroker fakeJmsSource = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);

		System.out.println(fakeJmsSource.getUrl());


	}

}
