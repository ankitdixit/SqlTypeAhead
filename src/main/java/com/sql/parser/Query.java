package com.sql.parser;

import com.sun.istack.internal.NotNull;

public class Query
{
    final String queryText;
    final String queryId;
    final String user;
    final String timeStamp;
    final String database;

    public Query(@NotNull String queryText, @NotNull String queryId, String user, String timeStamp, String database)
    {
        this.queryText = queryText;
        this.queryId = queryId;
        this.user = user;
        this.timeStamp = timeStamp;
        this.database = database;
    }

    public String getQueryText()
    {
        return queryText;
    }

    public String getQueryId()
    {
        return queryId;
    }

    public String getUser()
    {
        return user;
    }

    public String getTimeStamp()
    {
        return timeStamp;
    }

    public String getDatabase()
    {
        return database;
    }

    @Override
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
    }
}
