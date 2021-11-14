package it.epicode.beservice.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class IndirizzoControllerTest {

	@LocalServerPort
	private int port = 8080;
	
	@Autowired
	TestRestTemplate restTemplate;
	
	@Test
	void testSalvaIndirizzo() throws JSONException {
//		String provinciaJson = new JSONObject().put("id", "86").put("nome", "Roma").put("sigla", "RM").toString();
//		String comuneJson = new JSONObject().put("id", "5196").put("nome", "Rocca Priora").put("provincia", provinciaJson).toString();
//		String indirizzoJson = new JSONObject().put("via", "Via di Rocca Priora").put("civico", "20").put("cap", "00121").put("localita", "campagna").put("comune", comuneJson).toString();
//		
//		this.restTemplate.postForEntity("http://localhost:"+port+"/indirizzocontroller/salvaindirizzo", indirizzoJson, void.class);
		
	}

}



