
package com.interface21.beans;

/**
 * Object containing 0 or more PropertyValues comprising
 * one update.
 *
 * 包含0个或多个PropertyValues的对象，包含一个更新。
 *
 * @author  Rod Johnson
 * @since 13 May 2001
 * @version $Id$
 */
public interface PropertyValues {
   
	/** 
	 * Return an array of the PropertyValue objects
	 * held in this object.
	 * @return an array of the PropertyValue objects
	 * held in this object.
	 */
	PropertyValue[] getPropertyValues();	
	
	/** 
	 * Is there a propertyValue object for this property?
	 * @param propertyName name of the property we're interested in
	 *@return whether there is a propertyValue object for this property?
	 */
	boolean contains(String propertyName);
	
	/** 
	 * Return the property value with the given name
	 * @param propertyName name to search for
	 * @return pv or null
	 */
	PropertyValue getPropertyValue(String propertyName);
	
	/**
	 * Return the changes since the previous PropertyValues.
	 * Subclasses should also override equals.
	 *
	 * 返回自上一个PropertyValues以来的更改。 子类也应该重写equals。
	 *
	 * @param old old property values
	 * @return PropertyValues updated or new properties.
	 * Return the empty PropertyValues if there are no changes.
	 */
	PropertyValues changesSince(PropertyValues old);

}
