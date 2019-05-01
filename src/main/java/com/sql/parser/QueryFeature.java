package com.sql.parser;

import com.sun.istack.internal.NotNull;

public class QueryFeature
{
    final Query query;
    final Feature feature;

    public QueryFeature(@NotNull Query query, @NotNull Feature feature)
    {
        this.query = query;
        this.feature = feature;
    }

    public Query getQuery()
    {
        return query;
    }

    public Feature getFeature()
    {
        return feature;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) { return true; }
        if (!(o instanceof QueryFeature)) { return false; }

        QueryFeature that = (QueryFeature) o;

        if (!getQuery().equals(that.getQuery())) { return false; }
        return getFeature().equals(that.getFeature());
    }

    @Override
    public int hashCode()
    {
        int result = getQuery().hashCode();
        result = 31 * result + getFeature().hashCode();
        return result;
    }
}
