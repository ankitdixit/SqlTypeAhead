package com.sql.parser;

import com.sun.istack.internal.NotNull;

public class Feature
{
    final FeatureType featureType;
    final String value;

    public Feature(@NotNull FeatureType featureType, @NotNull String value) {
        this.featureType = featureType;
        this.value = value;
    }

    public FeatureType getFeatureType()
    {
        return featureType;
    }

    public String getValue()
    {
        return value;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) { return true; }
        if (!(o instanceof Feature)) { return false; }

        Feature feature = (Feature) o;

        if (getFeatureType() != feature.getFeatureType()) { return false; }
        return getValue().equals(feature.getValue());
    }

    @Override
    public int hashCode()
    {
        int result = getFeatureType().hashCode();
        result = 31 * result + getValue().hashCode();
        return result;
    }
}
