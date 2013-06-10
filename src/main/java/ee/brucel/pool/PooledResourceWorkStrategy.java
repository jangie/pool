package ee.brucel.loadbalance;

import java.util.Map;

public interface PooledResourceWorkStrategy<T, S> {
	T processWork(S resource, Map<String, Object> parameters) throws IllegalArgumentException;
}