package poc.meecropoc;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import static java.util.Optional.ofNullable;

@Path("hello")
@ApplicationScoped
public class PocEndpoint {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Hello sayHi(@QueryParam("name") final String name) {
        return new Hello(ofNullable(name).orElse("nobody"));
    }

    public final static class Hello {
        private String name;

        public Hello(String name){
            this.setName(name);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
