package poc.meecropoc;

import javax.enterprise.context.Dependent;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Dependent
@ApplicationPath("api")
public class PocApplication extends Application {

}
