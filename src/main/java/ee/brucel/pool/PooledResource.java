package ee.brucel.pool;

import java.util.concurrent.Semaphore;

class PooledResource <T> implements Comparable<PooledResource<T>>{
	Semaphore permit;
	T resource;
	Class<T> myType;
	PooledResource(T resource, Class<T> type){
		permit = new Semaphore(1);
		this.resource = resource;
		this.myType = type;
	}
	public int compareTo(PooledResource<T> other) {
		if (this == other) {
			return 0;
		}
		if (this.permit.availablePermits() > other.permit.availablePermits()) {
			return -1;
		}
		if (this.permit.availablePermits() < other.permit.availablePermits()) {
			return 1;
		}
		return 0;
	}
}