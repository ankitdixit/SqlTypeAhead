package com.sql.parser;

import java.util.List;
import java.util.Optional;

public class ParseQueryResult
{
    private List<Feature> features;
    private Optional<FeatureType> incompleteFeature;

    public ParseQueryResult(List<Feature> features, Optional<FeatureType> incompleteFeature)
    {
        this.features = features;
        this.incompleteFeature = incompleteFeature;
    }

    public List<Feature> getFeatures()
    {
        return features;
    }

    public Optional<FeatureType> getIncompleteFeature()
    {
        return incompleteFeature;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) { return true; }
        if (!(o instanceof ParseQueryResult)) { return false; }

        ParseQueryResult that = (ParseQueryResult) o;

        if (getFeatures() != null ? !getFeatures().equals(that.getFeatures()) : that.getFeatures() != null) { return false; }
        return getIncompleteFeature() != null ? getIncompleteFeature().equals(that.getIncompleteFeature()) : that.getIncompleteFeature() == null;
    }

    @Override
    public int hashCode()
    {
        int result = getFeatures() != null ? getFeatures().hashCode() : 0;
        result = 31 * result + (getIncompleteFeature() != null ? getIncompleteFeature().hashCode() : 0);
        return result;
    }
}
