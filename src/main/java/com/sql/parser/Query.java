package com.sql.parser;

import com.sun.istack.internal.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "QUERY1")
public class Query
{
    @Id @GeneratedValue
    @Column(name = "id")
    Integer queryId;

    @Column(name = "text")
    String queryText;

    @Column(name = "user")
    String user;

    @Column(name = "timestamp")
    Timestamp timeStamp;

    @Column(name = "db")
    String database;

    public Query(@NotNull String queryText, String user, Timestamp timeStamp, String database)
    {
        /*this.queryText = queryText;
        this.user = user;*/
        this.timeStamp = timeStamp;
        this.database = database;
    }

    public Query() {}


    public String getQueryText()
    {
        return queryText;
    }


    public int getQueryId()
    {
        return queryId;
    }

    public String getUser()
    {
        return user;
    }

    public Timestamp getTimeStamp()
    {
        return timeStamp;
    }

    public String getDatabase()
    {
        return database;
    }

    public void setQueryId(int queryId)
    {
        this.queryId = queryId;
    }

    public void setQueryText(String queryText)
    {
        this.queryText = queryText;
    }

    public void setUser(String user)
    {
        this.user = user;
    }

    public void setTimeStamp(Timestamp timeStamp)
    {
        this.timeStamp = timeStamp;
    }

    public void setDatabase(String database)
    {
        this.database = database;
    }

/*    @Override
    public boolean equals(Object o)
    {
        if (this == o) { return true; }
        if (!(o instanceof Query)) { return false; }

        Query query = (Query) o;

        if (!getQueryText().equals(query.getQueryText())) { return false; }
        return getDatabase() != null ? getDatabase().equals(query.getDatabase()) : query.getDatabase() == null;
    }

    @Override
    public int hashCode()
    {
        int result = getQueryText().hashCode();
        result = 31 * result + (getDatabase() != null ? getDatabase().hashCode() : 0);
        return result;
    }*/


}
