package utils;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.webapp.WebAppContext;


public class ServerBootstrap {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
        
        Server server = new Server(8080);
        
        WebAppContext context = new WebAppContext();
        context.setDescriptor("./src/content/WEB-INF/web.xml");
        context.setResourceBase("./src/content/");
        context.setContextPath("/");
        context.setParentLoaderPriority(true);
        context.setExtractWAR(true);
        
        server.setHandler(context);
 
        server.start();
        server.join();


	}

}
