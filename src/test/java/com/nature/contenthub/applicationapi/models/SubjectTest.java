package com.nature.contenthub.applicationapi.models;

import com.nature.contenthub.applicationapi.models.Subject;
import junit.framework.*;

public class SubjectTest extends TestCase {
    public SubjectTest(String name) {
	super(name);
    }

    public void testBasicInfo() {
	Subject subject = new Subject(1, "Test Name");
	assertEquals(1, subject.getId());
	assertEquals("Test Name", subject.getName());
    }
}