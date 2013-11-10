package com.nature.contenthub.applicationapi.services;

import java.util.ArrayList;
import com.hp.hpl.jena.rdf.model.Model;
import com.nature.contenthub.applicationapi.models.Article;
import com.nature.contenthub.applicationapi.models.PaginatedCollection;
import com.nature.contenthub.applicationapi.models.Subject;
import com.nature.contenthub.applicationapi.services.TripleStoreService;

public class SubjectService {
    public static PaginatedCollection<Article> getArticlesForSubject(int id) {
	Model model = TripleStoreService.getModel();
	ArrayList<Article> articles = new ArrayList<Article>();
	articles.add(new Article(1, "http://www.test.com/articles/1"));
	articles.add(new Article(2, "http://www.test.com/articles/2"));
	return new PaginatedCollection<Article>(articles, 0, 50, 2);
    }

    public static Subject getSubject(int id) {
	return new Subject(id, "Subject Name");
    }
}