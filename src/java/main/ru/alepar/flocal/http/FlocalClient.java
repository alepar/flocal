package ru.alepar.flocal.http;

public interface FlocalClient {

    String getPage(String url);

    class Factory {
        public static FlocalClient create() {
            return new ApacheHttpClient();
        }
    }

}
