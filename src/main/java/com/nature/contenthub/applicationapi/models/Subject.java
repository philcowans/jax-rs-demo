package com.nature.contenthub.applicationapi.models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Subject {
    @XmlAttribute
    int id;

    @XmlAttribute
    String name;

    public Subject() {
	// This is only here because the annotations seem to require it - need to understand why.
    }

    public Subject(int _id, String _name) {
	id = _id;
	name = _name;
    }

    public int getId() {
	return id;
    }

    public String getName() {
	return name;
    }
}