package test;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.Key;

import java.util.ArrayList;
import java.util.List;

/**
 * Generated JavaDoc Comment.
 *
 * @author Matt Nathan
 */
public class UrlParams {
  public static void main(String[] args) {
    MyUrl url = new MyUrl("http://example.com");
    System.out.println("Without tags = " + url.build());
    url.tags.add("one");
    System.out.println("One tag      = " + url.build());
    url.tags.add("two");
    System.out.println("Two tags     = " + url.build());

  }

  public static class MyUrl extends GenericUrl {
    @Key("tag")
    public List<String> tags = new ArrayList<String>();

    public MyUrl(String encodedUrl) {
      super(encodedUrl);
    }
  }
}
