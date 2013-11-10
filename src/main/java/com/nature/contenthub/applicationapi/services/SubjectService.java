package com.nature.contenthub.applicationapi.services;

import com.nature.contenthub.applicationapi.models.Article;
import com.nature.contenthub.applicationapi.models.PaginatedCollection;
import com.nature.contenthub.applicationapi.models.Subject;

public class SubjectService {
    public static PaginatedCollection<Article> getArticlesForSubject(int id) {
	PaginatedCollection<Article> paginatedCollection = new PaginatedCollection<Article>();
	paginatedCollection.add(new Article(1, "http://www.test.com/articles/1"));
	paginatedCollection.add(new Article(2, "http://www.test.com/articles/2"));
	return paginatedCollection;
    }

    public static Subject getSubject(int id) {
	return new Subject(id, "Subject Name");
    }
}