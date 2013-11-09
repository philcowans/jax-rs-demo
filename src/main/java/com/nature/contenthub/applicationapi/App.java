package com.nature.contenthub.applicationapi;

import com.nature.contenthub.applicationapi.models.Subject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
public class App {
    @GET
    @Path("/subjects/{id}")
    @Produces("application/json")
    public Subject showSubject(@PathParam("id") int id) {
	return new Subject(id, "Subject Name");
    }
}
