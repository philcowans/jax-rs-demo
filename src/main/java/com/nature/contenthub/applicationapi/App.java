package com.nature.contenthub.applicationapi;

import com.nature.contenthub.applicationapi.models.Article;
import com.nature.contenthub.applicationapi.models.PaginatedCollection;
import com.nature.contenthub.applicationapi.models.Subject;
import com.nature.contenthub.applicationapi.services.SubjectService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
public class App {
    @GET
    @Path("/subjects/{id}")
    @Produces("application/json")
    public Subject getSubject(@PathParam("id") int id) {
	return SubjectService.getSubject(id);
    }

    @GET
    @Path("/subjects/{id}/articles")
    @Produces("application/json")
    public PaginatedCollection<Article> getArticlesForSubject(@PathParam("id") int id) {
	return SubjectService.getArticlesForSubject(id);
    }
}
