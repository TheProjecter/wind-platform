package br.com.maisha.wind.common.listener;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IAppRegistryListener {

	public enum LevelType {
		Application, Object, Message, Exception, GridData
	}

	public enum ChangeType {
		Added, 
		Removed, 
		ValueChanged, 
		BeforeObjectOpen, 
		ObjectOpen, 
		AfterObjectOpen, 
		BeforeObjectClose,
		ObjectClose, 
		AfterObjectClose, 
		InstanceOpened
	}

	/**
	 * 
	 * @param oldValue
	 * @param newValue
	 * @param level
	 * @param change
	 */
	void modelChanged(Object oldValue, Object newValue, LevelType level, ChangeType change);

}
