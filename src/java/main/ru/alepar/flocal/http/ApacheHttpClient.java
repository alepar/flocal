package ru.alepar.flocal.http;

import com.google.common.collect.Lists;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.ResourceBundle;

public class ApacheHttpClient implements HttpClient {

    private static final String ROOT_URL = "http://forumlocal.ru";
    private static final String username, password;
    static {
        final ResourceBundle bundle = ResourceBundle.getBundle("credentials");
        username = bundle.getString("username");
        password = bundle.getString("password");
    }

    private final DefaultHttpClient httpclient;

    public ApacheHttpClient() {
        try {
            httpclient = new DefaultHttpClient();
            final HttpHost proxy = new HttpHost("surf-proxy.intranet.db.com", 8080);
            httpclient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);

            try(CloseableRequest<HttpPost> loginPost = new CloseableRequest<>(new HttpPost(ROOT_URL + "/start_page.php"))) {
                final List<NameValuePair> nvps = Lists.newArrayList();
                nvps.add(new BasicNameValuePair("Cat", ""));
                nvps.add(new BasicNameValuePair("Loginname", username));
                nvps.add(new BasicNameValuePair("Loginpass", password));
                nvps.add(new BasicNameValuePair("rememberme", "1"));
                nvps.add(new BasicNameValuePair("firstlogin", "1"));
                nvps.add(new BasicNameValuePair("buttlogin", "Login"));
                loginPost.request.setEntity(new UrlEncodedFormEntity(nvps));
                readResponse(loginPost.request);
            }
        } catch (Exception e) {
            throw new RuntimeException("failed to create flocal httpclient", e);
        }
    }

    @Override
    public String getPage(String url) {
        try {
            try(CloseableRequest<HttpGet> loginPost = new CloseableRequest<>(new HttpGet(ROOT_URL + url))) {
                return readResponse(loginPost.request);
            }
        } catch (Exception e) {
            throw new RuntimeException("failed to get page " + url, e);
        }
    }

    private String readResponse(HttpRequestBase request) throws IOException {
        final HttpResponse response = httpclient.execute(request);

        if (response.getStatusLine().getStatusCode() != HttpURLConnection.HTTP_OK) {
            throw new RuntimeException("failed to load page "+request.getURI()+": error code " + response.getStatusLine().getStatusCode());
        }
        final HttpEntity entity = response.getEntity();

        return readToString(entity.getContent());
    }

    private static String readToString(InputStream is) throws IOException {
        final Reader reader = new InputStreamReader(is, "windows-1251");

        final StringBuilder sb = new StringBuilder();
        final char[] buffer = new char[102400];
        int read;
        while((read = reader.read(buffer)) != -1) {
            sb.append(buffer, 0, read);
        }

        return sb.toString();
    }
}
