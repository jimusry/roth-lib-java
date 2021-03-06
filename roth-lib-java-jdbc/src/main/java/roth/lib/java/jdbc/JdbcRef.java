package roth.lib.java.jdbc;

import java.sql.Ref;
import java.sql.SQLException;
import java.util.Map;

public abstract class JdbcRef implements Ref, JdbcWrapper
{
	protected Ref ref;
	
	public JdbcRef(Ref ref)
	{
		this.ref = ref;
	}
	
	public String getBaseTypeName() throws SQLException
	{
		return ref.getBaseTypeName();
	}
	
	public Object getObject(Map<String, Class<?>> map) throws SQLException
	{
		return ref.getObject(map);
	}
	
	public Object getObject() throws SQLException
	{
		return ref.getObject();
	}
	
	public void setObject(Object value) throws SQLException
	{
		ref.setObject(value);
	}
	
}
