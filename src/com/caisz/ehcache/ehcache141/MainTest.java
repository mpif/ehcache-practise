package com.caisz.ehcache.ehcache141;

import java.net.URL;

import com.caisz.ehcache.ehcache141.cacheobject.Book;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		URL url = com.caisz.ehcache.ehcache141.MainTest.class.getResource( "ehcache.xml" );
		CacheManager cacheManager = CacheManager.create( url );
		Cache irCache = cacheManager.getCache("IR");
		
		Book book = new Book();
		book.setId(1);
		book.setName("Android开发入门经典");
		book.setPrice(24);
		
		irCache.put(new Element("book", book));
		
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Element element = irCache.get("book");
		Book cacheBook = (Book)element.getObjectValue();
		System.out.println(cacheBook);
	}

}
