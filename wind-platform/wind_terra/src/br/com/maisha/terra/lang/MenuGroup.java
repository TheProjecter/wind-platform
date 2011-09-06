package br.com.maisha.terra.lang;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class MenuGroup extends Menu {

	private List<MenuItem> items = new ArrayList<MenuItem>();
	private List<MenuGroup> groups = new ArrayList<MenuGroup>();

	public void addItem(MenuItem mi) {
		items.add(mi);
	}

	public void addMenuGroup(MenuGroup mg) {
		groups.add(mg);
	}

	public List<MenuItem> getItems() {
		return items;
	}

	public void setItems(List<MenuItem> items) {
		this.items = items;
	}

	public List<MenuGroup> getGroups() {
		return groups;
	}

	public void setGroups(List<MenuGroup> groups) {
		this.groups = groups;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();

		sb.append("Group: ").append(getLabel()).append("\n");
		for (MenuItem mi : items) {
			sb.append("   ").append(mi);
		}

		for (MenuGroup mg : groups) {
			sb.append("   ").append(mg.toString()).append("\n");
		}

		return sb.toString();
	}
}
