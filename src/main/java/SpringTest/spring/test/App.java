package SpringTest.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fifth.day.Order;
import com.test.service.AppCOnfig;
import com.test.service.OrderService;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppCOnfig.class);
		Order order = new Order();
		order.setOrderId(1);
		OrderService orderService = ctx.getBean(OrderService.class);
		orderService.buyOrder(order);
//		orderService.handleOrders(null);
		orderService.sellOrder(order);
	}
}
