package com.woorea.openstack.cinder.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author Naresh < naresh.kibnc@gmail.com >
 */
public class Volumes implements Iterable<Volume>, Serializable {

    /**
     * The Id for the Volume.
     */
    @JsonProperty("volumes")
    private List<Volume> Id;

    public List<Volume> getId() {
        return Id;
    }
    private String rel;

    private String href;

    private String name;

    /**
     * @return the rel
     */
    public String getRel() {
        return rel;
    }

    /**
     * @return the href
     */
    public String getHref() {
        return href;
    }

    /**
     * @return the type
     */
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Link [rel :" + rel + ", href :" + href + ", name :" + name + "]";
    }
}