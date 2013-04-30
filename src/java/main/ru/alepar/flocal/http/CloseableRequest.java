package ru.alepar.flocal.http;

import org.apache.http.client.methods.HttpRequestBase;

public class CloseableRequest<T extends HttpRequestBase> implements AutoCloseable {

    public final T request;

    public CloseableRequest(T request) {
        this.request = request;
    }

    @Override
    public void close() {
        request.releaseConnection();
    }
}
