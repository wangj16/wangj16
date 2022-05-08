package org.com.tour;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;

public class Search {

    private String url;
    public Search()   {
    }

    public Document getDocumentByUrl(String url) throws IOException {
        Document document = Jsoup.connect(url).userAgent("Mozilla")
                .cookie("auth", "token")
                .timeout(3000)
                .get();

        return document;
    }
}
