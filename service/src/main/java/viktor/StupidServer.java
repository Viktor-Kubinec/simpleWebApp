package viktor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class StupidServer {
	
	static Server server = new Server(8080);
	
	static class HelloHandler extends AbstractHandler
	{
	    public void handle(String target,Request baseRequest,HttpServletRequest request,HttpServletResponse response) 
	        throws IOException, ServletException
	    {
	        if(target.equals("/shutdown")){
	        	System.out.println("Brutal Shutdown!");
	        	System.exit(0);
	        }
	        
	    	response.setContentType("text/html;charset=utf-8");
	        response.setStatus(HttpServletResponse.SC_OK);
	        baseRequest.setHandled(true);
	        response.getWriter().println("Hello " + target.substring(1));
	    }
	}
	
	public static void main(String[] args) throws Exception{
		server.setHandler(new HelloHandler());
		server.start();
        server.join();
        System.out.println("Test");
	}
}