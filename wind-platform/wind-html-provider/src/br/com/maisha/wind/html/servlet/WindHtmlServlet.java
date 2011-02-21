package br.com.maisha.wind.html.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;

import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.html.Activator;
import br.com.maisha.wind.lifecycle.registry.IApplicationRegistry;
import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class WindHtmlServlet extends HttpServlet {

	/** */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");

		String path = req.getPathInfo();
		if (StringUtils.isBlank(path)) {
			return;
		}

		String[] pathSplitted = path.split("/");
		String appId = pathSplitted[1];
		String page = pathSplitted[2];

		IApplicationRegistry registry = ServiceProvider.getInstance().getService(IApplicationRegistry.class,
				Activator.getDefault());

		WindApplication app = registry.retrieve(appId);
		URL url = app.getBundleContext().getBundle().getEntry(page);
		InputStream is = url.openStream();

		Configuration cfg = new Configuration();
		Template t = new Template(appId, new InputStreamReader(is), cfg);

		Map<String, Object> data = new HashMap<String, Object>();
		data.put("app", app);
		data.put("apps", registry.retrieve());

		try {
			t.process(data, resp.getWriter());
		} catch (Exception e) {
			// TODO log
			resp.getWriter().write("Sorry!");
		}

	}

}
