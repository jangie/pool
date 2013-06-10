package ee.brucel.pool;

import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;

public class Pool {
	private static final Logger logger = Logger.getLogger(Pool.class);
	private static Map<String, SortedSet<PooledResource>> poolGroups = new ConcurrentHashMap<String, SortedSet<PooledResource>>();
	
	public static <T, S> T doWorkOnNextAvailableResource(String key, PooledResourceWorkStrategy<T, S> strategy, Map<String, Object> parameters){
		return null;
	}
	
	public static <T> void initializeGroup(List<T> initialItems, String key) {
		SortedSet<PooledResource> pooledResources = new TreeSet<PooledResource>();
		for (T resource : initialItems) {
			PooledResource<T> pooledResource = new PooledResource<T>(resource, (Class<T>)resource.getClass());
			pooledResources.add(pooledResource);
		}
		poolGroups.put(key, pooledResources);
	}

}