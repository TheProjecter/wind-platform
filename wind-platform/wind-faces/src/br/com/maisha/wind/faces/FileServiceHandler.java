package br.com.maisha.wind.faces;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.eclipse.rwt.RWT;
import org.eclipse.rwt.service.IServiceHandler;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class FileServiceHandler implements IServiceHandler {

	/**
	 * 
	 * @see org.eclipse.rwt.service.IServiceHandler#service()
	 */
	public void service() throws IOException, ServletException {
		
		try{
			Thread.sleep(5000);
		}catch(Exception e){
			
		}
		
		String id = RWT.getRequest().getParameter("filename");
		InputStream stream = (InputStream) RWT.getSessionStore().getAttribute(id);
		HttpServletResponse response = RWT.getResponse();
		
		response.setContentType("image/octet-stream");
		try {
			ServletOutputStream out = response.getOutputStream();
			IOUtils.copy(stream, out);
			RWT.getSessionStore().setAttribute(id, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
