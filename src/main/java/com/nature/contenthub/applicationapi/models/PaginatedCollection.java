package com.nature.contenthub.applicationapi.models;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PaginatedCollection<E> {
    @XmlAttribute
    List<E> collection;

    @XmlAttribute
    int page;

    @XmlAttribute
    int perPage;

    @XmlAttribute
    int totalElements;

    public PaginatedCollection() {
	collection = new ArrayList<E>();
    }

    public void add(E element) {
	collection.add(element);
    }
}