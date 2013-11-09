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