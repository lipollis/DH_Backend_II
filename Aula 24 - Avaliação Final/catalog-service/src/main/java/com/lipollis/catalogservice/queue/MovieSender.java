package com.lipollis.catalogservice.queue;

import com.lipollis.catalogservice.model.Movie;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieSender {

//	@Autowired
//	MovieServiceClient serviceClient;

	@Autowired
	private RabbitTemplate rabbitTemplate;

//	@Autowired
	private Queue movieQueue;

	public void send(Movie movie) {
		this.rabbitTemplate.convertAndSend(this.movieQueue.getName(), movie/*serviceClient.saveMovie(movie)*/);
	}
}
