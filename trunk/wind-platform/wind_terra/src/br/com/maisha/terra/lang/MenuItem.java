package br.com.maisha.terra.lang;

public class MenuItem extends Menu {

	public enum MenuType {
		SEPARATOR, ITEM
	}

	private String domainObject;

	private MenuType type;

	public String getDomainObject() {
		return domainObject;
	}

	public void setDomainObject(String domainObject) {
		this.domainObject = domainObject;
	}

	public MenuType getType() {
		return type;
	}

	public void setType(String type) {
		this.type = MenuType.valueOf(type);
	}

	public void setSeparator() {
		this.type = MenuType.SEPARATOR;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Item: ").append(getLabel()).append(" (").append(getDomainObject()).append(")").append("\n");
		return sb.toString();
	}

}
