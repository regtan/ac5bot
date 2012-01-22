package org.kirino.scrape;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.kirino.context.ContextKey;


public class Ac5HtmlScraper {
	public final String AC5_URL = "http://www.armoredcore.net/players/acv/";
	public Map<ContextKey,String> scrapeServerStatus() throws IOException {
		Document doc = Jsoup.connect(AC5_URL).timeout(20000).get();
		Elements elements = doc.select("div[id=status_info]");
		Map<ContextKey,String> status = new HashMap<ContextKey, String>();
		for(Element element:elements){
			status.put(ContextKey.PS3, element.getElementById(ContextKey.PS3.toString()).text());
			status.put(ContextKey.XBOX360, element.getElementById(ContextKey.XBOX360.toString()).text());
		}
		return status;
	}

}
