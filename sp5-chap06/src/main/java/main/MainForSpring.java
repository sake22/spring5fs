package main;

import config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import spring.*;

import java.io.IOException;

public class MainForSpring {

	public static void main(String[] args) throws IOException {
		AbstractApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppCtx.class);

		Client client0 = ctx.getBean(Client.class);
		Client client1 = ctx.getBean(Client.class);
		client0.send();

		Client2 client2 = ctx.getBean(Client2.class);
		Client2 client3 = ctx.getBean(Client2.class);
		client2.send();

		ctx.close();

		//싱글톤 x
		//프로토타입 범위의 빈을 사용할 때 소멸 처리를 코드에서 직접 해주어야 함.
		System.out.println("client0 == client1 : " + (client0==client1));

		//싱글톤 o
		System.out.println("client2 == client3 : " + (client2==client3));
	}

}
