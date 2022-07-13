package com.lipollis.serieservice.domain.data;

import com.lipollis.serieservice.domain.model.Serie;
import com.lipollis.serieservice.domain.repository.SerieRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

	private SerieRepository repository;

	public DataLoader (SerieRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run (ApplicationArguments args) throws Exception {
		repository.save(new Serie(1L, "filme", "terror", "what"));
		repository.save(new Serie(2L, "borboleta", "terror", "what"));
		repository.save(new Serie(3L, "adedonha", "terror", "what"));
		repository.save(new Serie(4L, "pajero", "terror", "what"));
		repository.save(new Serie(5L, "dakar", "acao", "what"));
		repository.save(new Serie(6L, "shadow", "acao", "what"));
		repository.save(new Serie(7L, "boné", "romance", "what"));
		repository.save(new Serie(8L, "xícara", "romance", "what"));
	}
}
