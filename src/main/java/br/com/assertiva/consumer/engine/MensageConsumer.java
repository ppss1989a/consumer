package br.com.assertiva.consumer.engine;


import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MensageConsumer  {	

    private RestTemplate restTemplate = new RestTemplate();

    private final String urlProducer = "http://localhost:5000/services/longo";

	@KafkaListener(topics = {"mensagem"})
	public void onMessage(ConsumerRecord<Integer, String> data) {
	        System.out.println("ConsumerRecord :  "+ data);

		
	}
}



