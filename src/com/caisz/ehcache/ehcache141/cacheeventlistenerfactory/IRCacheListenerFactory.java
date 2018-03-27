package com.caisz.ehcache.ehcache141.cacheeventlistenerfactory;

import java.util.Properties;

import net.sf.ehcache.event.CacheEventListener;
import net.sf.ehcache.event.CacheEventListenerFactory;

public class IRCacheListenerFactory extends CacheEventListenerFactory {

	@Override
	public CacheEventListener createCacheEventListener(Properties arg0) {
		return new IRCacheListener();
	}

}
