package com.sql.parser;

import java.util.List;

public interface Parser
{
    public List<Feature> parseQuery(Query query);
}
