package om.suraj.spring.test;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suraj.spring.beans.Movie;

public class MovieTest {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("spring.xml");
			Movie movie = context.getBean("movie", Movie.class);
			System.out.println(movie.getMovieName());
			movie.getSong().play();
			List<String> movieList = movie.getMovieNames();
			for (String mNames : movieList) {
				System.out.println(mNames);
			}
		} catch (BeansException e) {
			e.printStackTrace();
		} finally {
			if (context != null) {
				((AbstractApplicationContext) context).close();
			}
		}
	}

}
