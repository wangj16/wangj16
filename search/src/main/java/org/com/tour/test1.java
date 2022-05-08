package org.com.tour;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.google.common.io.Files;

public class test1 {
	
  private static Matcher matcher;
  private static final String DOMAIN_NAME_PATTERN
          = "([a-zA-Z0-9]([a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9])?\\.)+[a-zA-Z]{2,15}";
  private static Pattern patrn = Pattern.compile(DOMAIN_NAME_PATTERN);

  public static String getDomainName(String url) {

      String domainName = "";
      matcher = patrn.matcher(url);
      
      if (matcher.find()) {
          domainName = matcher.group(0).toLowerCase().trim();
      }
      
      return domainName;
  }

  public static void main(String[] args) throws IOException {

      String query = "Milky Way";

      String url = "https://www.google.com/search?q=" + query + "&num=10";

      Document doc = Jsoup
              .connect(url)
              .userAgent("Jsoup client")
              .timeout(5000).get();

      Elements links = doc.select("a[href]");

      Set<String> result = new HashSet<>();

      for (Element link : links) {

          String attr1 = link.attr("href");
          String attr2 = link.attr("class");
          
          if (!attr2.startsWith("_Zkb") && attr1.startsWith("/url?q=")) {
          
              result.add(getDomainName(attr1));
          }
      }

      for (String el : result) {
          System.out.println(el);
      }
  }
  
}
