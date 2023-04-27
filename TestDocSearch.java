import static org.junit.Assert.*;
import org.junit.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;

public class TestDocSearch {
	@Test 
	public void testIndex() throws URISyntaxException, IOException {
    Handler h = new Handler("./technical/");
    URI rootPath = new URI("http://localhost/");
    assertEquals("There are 224 total files to search.", h.handleRequest(rootPath));
	}
	@Test 
	public void testSearch() throws URISyntaxException, IOException {
    Handler h = new Handler("./technical/");
    URI rootPath = new URI("http://localhost/search?q=sushi");
    //String expect = "Found 3 paths:\n./written_2/travel_guides/berlitz1/WhatToJapan.txt\n./written_2/travel_guides/berlitz1/WhereToJapan.txt\n./written_2/travel_guides/berlitz2/California-WhereToGo.txt";
    //assertEquals(expect, h.handleRequest(rootPath));

    Handler h2 = new Handler("./technical/plos");
    rootPath = new URI("http://localhost/search?q=base%20pair");
    String expected = "Found 2 paths:\n.\\technical\\plos\\journal.pbio.0020190.txt\n.\\technical\\plos\\journal.pbio.0020223.txt";
    assertEquals(expected, h2.handleRequest(rootPath));

	}


}

