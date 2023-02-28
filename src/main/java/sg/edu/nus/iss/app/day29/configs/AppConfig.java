package sg.edu.nus.iss.app.day29.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.client.MongoClients;

import static sg.edu.nus.iss.app.day29.Constants.*;

@Configuration
public class AppConfig {
    
    @Value("${mongo.url}")
	private String mongoUrl;

	@Bean
	public MongoTemplate createTemplate() {
		return new MongoTemplate(MongoClients.create(mongoUrl), SHOWS);
	}
}
