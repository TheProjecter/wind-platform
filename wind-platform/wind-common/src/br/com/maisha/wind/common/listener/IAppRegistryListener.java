package br.com.maisha.wind.common.listener;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IAppRegistryListener {

	public enum LevelType {
		Application, Object, Property, Operation, Message, Exception
	}

	public enum ChangeType {
		Added, Removed, ValueChanged, ObjectOpened, ObjectClosed, InstanceOpened
	}

	/**
	 * 
	 * @param oldValue
	 * @param newValue
	 * @param level
	 * @param change
	 */
	void modelChanged(Object oldValue, Object newValue, LevelType level,
			ChangeType change);

}
