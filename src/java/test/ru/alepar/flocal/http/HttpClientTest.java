package ru.alepar.flocal.http;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class HttpClientTest {

    private final HttpClient httpClient = HttpClient.Factory.create();

    @Test
    public void returnsPageAsLoggedInUser() throws Exception {
        assertThat(httpClient.getPage("/ubbthreads.php"), containsString("/logout.php"));
    }
}
