package com.reservemovie.reservemovie;

import com.reservemovie.reservemovie.entities.Movie;
import com.reservemovie.reservemovie.entities.Status;
import com.reservemovie.reservemovie.services.MovieService;
import com.reservemovie.reservemovie.services.StatusService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ReservemovieApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ReservemovieApplication.class, args);
		ApplicationContext context = SpringApplication.run(ReservemovieApplication.class, args);

		/**
		 * Create status
		 */

		StatusService statusService = (StatusService) context.getBean(StatusService.class);

		Status s1 = new Status();
		s1.setStatusName("Tentitive");

		Status savedStatus = statusService.acceptStatusDetails(s1);

		System.out.println("STATUS SAVED : "+savedStatus.toString());

		Status s2 = new Status();
		s2.setStatusName("Releasing Soon");
		savedStatus = statusService.acceptStatusDetails(s2);

		System.out.println("STATUS SAVED : "+savedStatus.toString());

		Status s3 = new Status();
		s3.setStatusName("Running");
		savedStatus = statusService.acceptStatusDetails(s3);

		System.out.println("STATUS SAVED : "+savedStatus.toString());

		/**
		 * Testing movie seervice
		 */

		MovieService movieService = (MovieService) context.getBean(MovieService.class);

		System.out.println("movie serviec bean : "+movieService);

		Movie movie1 = new Movie();

		movie1.setMovieName("Kantra");
		movie1.setMovieDesc("Super movie");
		movie1.setCoverPhotoUrl("https://kantara/coverPhoto");
		movie1.setTrailerUrl("https://kantara/trailer");
		movie1.setDuration(120);
		movie1.setReleaseDate(LocalDate.of(2023, 9, 22));
		movie1.setStatus(statusService.getStatusDetails(1));

		Movie savedMovie = movieService.acceptMovieDetails(movie1);

		System.out.println("Saved Movie : "+savedMovie.toString());

		List<Movie> movies = new ArrayList<>();

		Movie movie2 = new Movie();
		movie2.setMovieName("Kirik Party");
		movie2.setMovieDesc("Super movie");
		movie2.setCoverPhotoUrl("https://KirikParty/coverPhoto");
		movie2.setTrailerUrl("https://KirikParty/trailer");
		movie2.setDuration(120);
		movie2.setReleaseDate(LocalDate.of(2024, 9, 22));
		movie2.setStatus(statusService.getStatusDetails(2));

		movies.add(movie2);

		Movie movie3 = new Movie();

		movie3.setMovieName("Bell Bottom");
		movie3.setMovieDesc("Super movie");
		movie3.setCoverPhotoUrl("https://BellBottom/coverPhoto");
		movie3.setTrailerUrl("https://BellBottom/trailer");
		movie3.setDuration(120);
		movie3.setReleaseDate(LocalDate.of(2022, 9, 22));
		movie3.setStatus(statusService.getStatusDetails(3));

		movies.add(movie3);

		List<Movie> savedMovies = movieService.acceptAllMoviDetails(movies);

		System.out.println("Movies After Saving : ");

		for (Movie movie: savedMovies) {
			System.out.println(movie);
		}

	}

}
