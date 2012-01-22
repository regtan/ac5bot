package org.kirino.scrape;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;
import org.kirino.context.ContextKey;


public class Ac5HtmlScraperTest {

	@Test
	public void サイトに接続してPS3のステータス情報をとる() throws IOException {
		Ac5HtmlScraper ac5 = new Ac5HtmlScraper();
		Map<ContextKey, String> scrapeServerStatus = ac5.scrapeServerStatus();
		assertThat(scrapeServerStatus, is(notNullValue()));
		assertThat(scrapeServerStatus.get(ContextKey.PS3), is(notNullValue()));
		assertThat(scrapeServerStatus.get(ContextKey.XBOX360), is(notNullValue()));
		System.out.println(scrapeServerStatus.toString());
	}

}
