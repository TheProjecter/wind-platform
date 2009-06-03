package br.com.maisha.terra.lang;

public class Import extends TerraClass {

	private String path;

	public Import(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
