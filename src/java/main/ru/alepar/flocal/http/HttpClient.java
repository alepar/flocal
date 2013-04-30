package ru.alepar.flocal.http;

public interface HttpClient {

    String getPage(String url);

    class Factory {
        public static HttpClient create() {
            return new ApacheHttpClient();
        }
    }

}
