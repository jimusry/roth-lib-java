package roth.lib.java.test.json;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;

@Entity
public class GenericModelB
{
	@Property(name = "value")
	protected Double value;
	
	public GenericModelB()
	{
		
	}
	
	public Double getValue()
	{
		return value;
	}
	
	public GenericModelB setValue(Double value)
	{
		this.value = value;
		return this;
	}
	
}
