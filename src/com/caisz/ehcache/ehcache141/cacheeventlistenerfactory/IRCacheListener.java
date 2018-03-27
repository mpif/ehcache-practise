package com.caisz.ehcache.ehcache141.cacheeventlistenerfactory;

import com.caisz.ehcache.ehcache141.cacheobject.Book;

import net.sf.ehcache.CacheException;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;
import net.sf.ehcache.event.CacheEventListener;

public class IRCacheListener implements CacheEventListener {

	@Override
	public void dispose() {
		
	}

	@Override
	public void notifyElementEvicted(Ehcache arg0, Element arg1) {
		
	}

	@Override
	public void notifyElementExpired(Ehcache ehcache, Element element) {
		System.out.println("element expired! print expired object below");
		Book cacheBook = (Book)element.getObjectValue();
		System.out.println("expired object name:" + cacheBook.getName());
	}

	@Override
	public void notifyElementPut(Ehcache arg0, Element arg1)
			throws CacheException {
		
	}

	@Override
	public void notifyElementRemoved(Ehcache arg0, Element arg1)
			throws CacheException {
		
	}

	@Override
	public void notifyElementUpdated(Ehcache arg0, Element arg1)
			throws CacheException {
		
	}

	@Override
	public void notifyRemoveAll(Ehcache arg0) {
		
	}
	
	@Override
	public Object clone() {
		final IRCacheListenerFactory obj = null;
		/* Clone not supported! A super.clone() method or default constructor needed. */
		try
		{
			throw new CloneNotSupportedException();
		}
		catch ( final CloneNotSupportedException e )
		{
			e.printStackTrace();
		}
		return obj;
	}
		

}
