package org.com.tour;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

// import edu.emory.mathcs.nlp.component.tokenizer.Tokenizer;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;
import opennlp.tools.util.InvalidFormatException;
import opennlp.tools.util.Span;

public class test5 {

	public String Tokens[];
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		String queryUrl = "https://www.brooklynfare.com/chefs-table";
//		System.out.println(queryUrl);
//		Document document = Jsoup.connect(queryUrl).userAgent("Mozilla")
//				.cookie("auth", "token")
//				.timeout(3000)
//				.get();
//		Elements divEements = document.select("div");
//		System.out.println("divsDirect String array to String :    " + divEements.toString());

		test5 toi = new test5();
		String cnt;
		cnt="Krishtop made the comments at a press conference alongside other other Russian pilots held as prisoners of war, according to Interfax. Ukraine has conducted several similar news conferences with prisoners of war in an attempt to counter Russian propaganda about the war, The Daniel reported.";
		toi.tokenization(cnt);
		String cities = toi.namefind(toi.Tokens);
		String org = toi.orgfind(toi.Tokens);
		System.out.println("City name is : "+cities);
		System.out.println("organization name is: "+org);
	}

	public String namefind(String cnt[]) {
		InputStream is;
		TokenNameFinderModel tnf;
		NameFinderME nf;
		String sd = "";
		try {
			is = new FileInputStream("c:\\test\\en-ner-location.bin");
			tnf = new TokenNameFinderModel(is);
			nf = new NameFinderME(tnf);

			Span sp[] = nf.find(cnt);

			String a[] = Span.spansToStrings(sp, cnt);
			StringBuilder fd = new StringBuilder();
			int l = a.length;

			for (int j = 0; j < l; j++) {
				fd = fd.append(a[j] + "\n");

			}
			sd = fd.toString();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (InvalidFormatException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return sd;
	}

	public String orgfind(String cnt[]) {
		InputStream is;
		TokenNameFinderModel tnf;
		NameFinderME nf;
		String sd = "";
		try {
			is = new FileInputStream("c:\\test\\en-ner-organization.bin");
			tnf = new TokenNameFinderModel(is);
			nf = new NameFinderME(tnf);
			Span sp[] = nf.find(cnt);
			String a[] = Span.spansToStrings(sp, cnt);
			StringBuilder fd = new StringBuilder();
			int l = a.length;
			for (int j = 0; j < l; j++) {
				fd = fd.append(a[j] + "\n");

			}

			sd = fd.toString();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (InvalidFormatException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return sd;
	}
	public void tokenization(String tokens) {
		InputStream is;
		TokenizerModel tm;
		try {
			is = new FileInputStream("C:\\test\\en-token.bin");
			tm = new TokenizerModel(is);
			Tokenizer tz = new TokenizerME(tm);
			Tokens = tz.tokenize(tokens);
			// System.out.println(Tokens[1]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
