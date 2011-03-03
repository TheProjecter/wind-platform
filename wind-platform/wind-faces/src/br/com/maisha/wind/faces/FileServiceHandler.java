package br.com.maisha.wind.faces;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
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

	/** */
	private static final DateFormat df = new SimpleDateFormat("_ddMMyyyy_hhmmss");

	/** */
	public static enum ContentType {

		pdf("application/pdf"), txt("image/octet-stream"), xls("application/ms-excel"), DEFAULT("image/octet-stream");

		private String contentType;

		private ContentType(String contentType) {
			this.contentType = contentType;
		}

	}

	/**
	 * 
	 * @see org.eclipse.rwt.service.IServiceHandler#service()
	 */
	public void service() throws IOException, ServletException {

		HttpServletResponse response = RWT.getResponse();
		HttpServletRequest request = RWT.getRequest();

		String filename = request.getParameter("filename");
		String ext = request.getParameter("extension");

		// define content-type
		ContentType contentType = ContentType.valueOf(ext);
		if (contentType == null) {
			response.setContentType(ContentType.DEFAULT.contentType);
		} else {
			response.setContentType(contentType.contentType);
		}

		response.setHeader("Content-Disposition", "attachment;filename=" + df.format(new Date()) + "." + ext);

		try {
			// copy input stream
			InputStream stream = (InputStream) RWT.getSessionStore().getAttribute(filename);
			ServletOutputStream out = response.getOutputStream();
			IOUtils.copy(stream, out);
			RWT.getSessionStore().setAttribute(filename, null);
		} catch (IOException e) {
			e.printStackTrace(); // TODO handle
		}

	}
}
