package krzysztof.javaee8;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import krzysztof.javaee8.api.demo.DemoDto;

@RequestScoped
@Path("/demo")
@Produces(MediaType.APPLICATION_JSON)
public class RestDemo 
{
	@GET
	public DemoDto getDemo() {
		return new DemoDto();
	}

}
