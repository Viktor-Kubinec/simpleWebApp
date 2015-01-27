package viktor;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mashape.unirest.http.Unirest;

public class StupidServerTest {

	@Test
	public void testIt() throws Exception {
		String response = Unirest.get("http://localhost:8081/test").asString().getBody().trim();
		assertEquals("Hello test", response.trim());
	}
}
