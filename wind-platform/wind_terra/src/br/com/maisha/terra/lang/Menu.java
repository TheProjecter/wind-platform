package br.com.maisha.terra.lang;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class Menu implements Comparable<Menu> {

	private Boolean visible = true;

	private String label;

	private String icon;

	private Integer sequence;

	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	@Override
	public int compareTo(Menu other) {
		if (other == null) {
			return 1;
		}

		if (this == other) {
			return 0;
		}

		if (getSequence() == null) {
			return -1;
		}

		if (other.getSequence() == null) {
			return 1;
		}

		return getSequence().compareTo(other.getSequence());
	}

}
