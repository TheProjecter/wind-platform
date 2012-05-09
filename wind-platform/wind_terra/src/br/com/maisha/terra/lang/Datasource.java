/**
 * 
 */
package br.com.maisha.terra.lang;

/**
 * Holds information of a wind application datasource.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class Datasource {

	public static enum RDMBSVendor {
		postgres("org.postgresql.Driver", "org.hibernate.dialect.PostgreSQLDialect"), hsqldb("org.hsqldb.jdbc.JDBCDriver", "org.hibernate.dialect.HSQLDialect");

		private String driverClassName;
		private String hibDialect;

		private RDMBSVendor(String driverClassName, String hibDialect) {
			this.driverClassName = driverClassName;
			this.hibDialect = hibDialect;
		}

		/** @see Datasource.RDMBSVendor#driverClassName */
		public String getDriverClassName() {
			return driverClassName;
		}

		/** @see Datasource.RDMBSVendor#hibDialect */
		public String getHibDialect() {
			return hibDialect;
		}

	}

	/** Connection URL */
	private String url;

	/** Username. */
	private String username;

	/** Password. */
	private String password;

	/** Database Vendor. */
	private String rdbmsVendor;

	/**
	 * Default constructor. 
	 */
	public Datasource() {
	}
	
	/**
	 * @param url
	 * @param username
	 * @param password
	 * @param rdbmsVendor
	 */
	public Datasource(String url, String username, String password,
			String rdbmsVendor) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
		this.rdbmsVendor = rdbmsVendor;
	}

	/** @see Datasource#url */
	public String getUrl() {
		return url;
	}

	/** @see Datasource#url */
	public void setUrl(String url) {
		this.url = url;
	}

	/** @see Datasource#username */
	public String getUsername() {
		return username;
	}

	/** @see Datasource#username */
	public void setUsername(String username) {
		this.username = username;
	}

	/** @see Datasource#password */
	public String getPassword() {
		return password;
	}

	/** @see Datasource#password */
	public void setPassword(String password) {
		this.password = password;
	}

	/** @see Datasource#rdbmsVendor */
	public String getRdbmsVendor() {
		return rdbmsVendor;
	}

	/** @see Datasource#rdbmsVendor */
	public void setRdbmsVendor(String rdbmsVendor) {
		this.rdbmsVendor = rdbmsVendor;
	}
	
	
}
