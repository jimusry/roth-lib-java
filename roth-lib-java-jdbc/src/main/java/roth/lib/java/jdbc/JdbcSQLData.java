package roth.lib.java.jdbc;

import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;

public abstract class JdbcSQLData implements SQLData, JdbcWrapper
{
	protected SQLData sqlData;
	
	public JdbcSQLData(SQLData sqlData)
	{
		this.sqlData = sqlData;
	}
	
	public String getSQLTypeName() throws SQLException
	{
		return sqlData.getSQLTypeName();
	}
	
	public void readSQL(SQLInput stream, String typeName) throws SQLException
	{
		sqlData.readSQL(stream, typeName);
	}
	
	public void writeSQL(SQLOutput stream) throws SQLException
	{
		sqlData.writeSQL(stream);
	}
	
}
