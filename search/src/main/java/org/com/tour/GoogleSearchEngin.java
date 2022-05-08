package org.com.tour;

import opennlp.tools.util.StringUtil;
import org.com.tour.service.OpenNlpService;
import org.com.tour.util.SearchUtil;
import org.com.tour.util.nlp.SentenceDetectorImpl;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.net.URL;
import java.util.*;

@Component
public class GoogleSearchEngin extends Search {
		
    @Autowired
    private OpenNlpService openNlpService;

	@Autowired
	private SentenceDetectorImpl sentence;

	private static final String folderPath = "c:\\test\\";

	// public static final String GOOGLE_SEARCH_URL = "https://www.planetware.com/tourist-attractions/new-york-usny.htm";	
	@SuppressWarnings("rawtypes")
	public List<String> getTourDocumentByUrl(String url) throws IOException {

		ArrayList<String> tourList = new ArrayList<String>();
		// openNlpService.sentenceParser("test123a");
		Document document = getDocumentByUrl(url);
	    System.out.println(document.title());

        Elements divEements = document.select("div");

        for (Element paragraph : divEements) {
          if (!tourList.contains(paragraph.text())) {
        	String[] sentences = sentence.sentenceDetect(paragraph.text());
            for(int i=0;i<sentences.length;i++){
            	tourList.add(sentences[i]);
                //System.out.println(sentences[i]);
            }
            // System.out.println(paragraph.text());       
          }
        }
	    //document.outputSettings().prettyPrint(false).indentAmount(0);	    	    
	    //System.out.println(document.wholeText());				
	    // tourDocument = document.wholeText();
		return tourList;
	}

	@SuppressWarnings("rawtypes")
	public List<String> getRestaurantDocumentByUrl(String url) throws IOException {
		// url = "https://www.timeout.com/newyork/restaurants/100-best-new-york-restaurants";
		// url = "https://guide.michelin.com/us/en/new-york-state/new-york/restaurant/giuliana-s";
		ArrayList<String> restaurantList = new ArrayList<String>();
		Document document = getDocumentByUrl(url);
		System.out.println(document.title());

		//333
		//Elements images = document.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
		//Elements images = document.select("a[href]");
		Elements images = document.getElementsByTag("img");
		//   String imgSrc = img.attr("src");
		// Elements links = document.select("a[href]");
		Elements media = document.select("[src]");
		//  Elements imports = document.select("link[href]");

		print("\nMedia: (%d)", media.size());
		for (Element src : media) {
			if (src.normalName().equals("img")
					&& (src.attr("abs:src")).indexOf("michelin-guide-logo") == -1
			        && !restaurantList.contains(src.attr("abs:src"))
					&& src.attr("abs:src").indexOf("guide.michelin") == -1)	{
//						src.tagName(), src.attr("abs:src"), src.attr("width"), src.attr("height"),
//						trim(src.attr("alt"), 20));
//					 src.attr("abs:src")),
//					trim(src.attr("alt"), 20));
				System.out.println("11111: " + src.attr("abs:src"));
				restaurantList.add(src.attr("abs:src"));
				if (src.attr("abs:src").indexOf("footer-img.jpg") != -1) {
					break;
				}
			}
			else {
				print(" 3333333 * %s: <%s>", src.tagName(), src.attr("abs:src"));
			}
		}
//		print("\nLinks: (%d)", links.size());
//		for (Element link : links) {
//			print(" * a: <%s>  (%s)", link.attr("abs:href"), trim(link.text(), 35));
//		}
//		for (Element image : images) {
//			System.out.println("\n");
//			String src = image.absUrl("src");
//			System.out.println("src attribute is : "+src);
//			// getImages(src);
//			// System.out.println("Link:  " + image.attr("href") + "  Text:   "
//			//		+ image.text());
//		}

//		Elements divEements = document.select("div");
//		for (Element paragraph : divEements) {
//			if (!restaurantList.contains(paragraph.text())) {
//				String[] sentences = sentence.sentenceDetect(paragraph.text());
//				for(int i=0; i<sentences.length; i++){
//					restaurantList.add(sentences[i]);
//				}
//				// System.out.println(paragraph.text());
//			}
//		}
		return restaurantList;
	}

	//333
	private static void print(String msg, Object... args) {
		System.out.println(String.format(msg, args));
	}

	private static String trim(String s, int width) {
		if (s.length() > width)
			return s.substring(0, width-1) + ".";
		else
			return s;
	}

	private static void getImages(String src) throws IOException {

		String folder = null;

		//Exctract the name of the image from the src attribute
		int indexname = src.lastIndexOf("/");

		if (indexname == src.length()) {
			src = src.substring(1, indexname);
		}

		indexname = src.lastIndexOf("/");
		String name = src.substring(indexname, src.length());

		// System.out.println(name);
		// Open a URL Stream
		URL url = new URL(src);
		InputStream in = url.openStream();

		OutputStream out = new BufferedOutputStream(new FileOutputStream( folderPath+ name));

		for (int b; (b = in.read()) != -1;) {
			out.write(b);
		}
		out.close();
		in.close();

	}

}
