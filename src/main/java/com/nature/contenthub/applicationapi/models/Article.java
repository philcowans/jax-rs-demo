package com.nature.contenthub.applicationapi.models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Article {
    @XmlAttribute
    int id;

    @XmlAttribute
    String url;

    public Article() {
	// This is only here because the annotations seem to require it - need to understand why.
    }

    public Article(int _id, String _url) {
	id = _id;
	url = _url;
    }
}