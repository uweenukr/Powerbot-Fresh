import org.powerbot.script.Script.Manifest;
import org.powerbot.script.PollingScript;

@Manifest(name = "HelloWorld", description = "Hello World!")
public class HelloWorld extends PollingScript {
	@Override
	public void poll() {
		log.info("Polled.");
	}
}