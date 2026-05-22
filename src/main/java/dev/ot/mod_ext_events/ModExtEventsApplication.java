package dev.ot.mod_ext_events;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class ModExtEventsApplication {

	private static final Logger log = LoggerFactory.getLogger(ModExtEventsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ModExtEventsApplication.class, args);
	}

	@KafkaListener(topics = "social-posts")
	void onSocialPost(ConsumerRecord<String, String> record) {
		log.info("Kafka [social-posts] key={} value={}", record.key(), record.value());
	}

}
