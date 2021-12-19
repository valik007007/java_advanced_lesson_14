package homework_lesson_14;

import java.util.Arrays;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Application {

	public static void main(String[] args) {

		Session session = HibernateSessionFactory.getSessionFactory().openSession();

		Transaction transaction = session.beginTransaction();
		Cart cart = new Cart("test", "name1");

		Item item1 = new Item("test1");
		Item item2 = new Item("test2");
		Item item3 = new Item("test3");
		Item item4 = new Item("test4");
		cart.setItems(new HashSet<>(Arrays.asList(item1, item2, item3, item4)));

		session.persist(cart);

		transaction.commit();
		session.close();

	}

}
