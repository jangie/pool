package ee.brucel.loadbalance;

import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;

public class Pool {
	private static final Logger logger = Logger.getLogger(Pool.class);
	private static Map<String, SortedSet<PooledResource>> poolGroups = new ConcurrentHashMap<String, SortedSet<PooledResource>>();
	
}