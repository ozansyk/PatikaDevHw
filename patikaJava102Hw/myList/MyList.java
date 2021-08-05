package patikaJavaHw.myList;

public class MyList<T> {
	private int capacity;
	private int size;
	private Object[] arr;
	
	
	public MyList() {
		this(10);
	}
	
	public MyList(int capacity) {
		this.capacity = capacity;
		size = 0;
		arr = new Object[capacity];
	}
	
	
	public int size() {
		return this.size;
	}
	
	public void add(T e) {
		if(size>=capacity) {
			capacity *= 2;
			Object[] temp = arr;
			arr = new Object[capacity];
			copyArray(arr, temp);
		}
		
		arr[size++] = e;
		
	}
	
	private void copyArray(Object[] arr, Object[] temp) {
		for(int i=0; i<temp.length; i++) {
			arr[i] = temp[i];
		}
		
	}
	
	public Object get(int index) {
		return index>=size || index<0 ? null : arr[index];
	}
	
	public Object remove(int index) {
		
		Object indexValue;
		Object[] temp;
		if(index<0 || index>=size) {
			return null;
		} else {
			indexValue = arr[index];
			temp = new Object[size];
			int j=0;
			for(int i=0; i<size-1; i++) {
				if(i != index) {
					temp[j] = arr[i];
					j++;
				}
			}
		}
		
		size--;
		arr = temp;
		return indexValue;
	}
	
	public void set(int index, T data) {
		if(index>=0 && index<size) {
			arr[index] = data;
		}
	}
	
	public String toString() {
		String s = "[";
		for(Object o : arr) {
			s = s + o + ",";
		}
		
		s = s.substring(0, s.length()-1);
		s += "]";
		return s;
	}
	
	public int indexOf(T data) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == data) {
				return i;
			}
		}
		
		return -1;
	}
	
	public int lastIndexOf(T data) {
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i] == data) {
				return i;
			}
		}
		
		return -1;
	}
	
	public boolean isEmpty() {
		boolean empty = true;
		
		for(Object o : arr) {
			if(o != null) {
				empty = false;
			}
		}
		
		return empty;
	}
	
	public T[] toArray() {
		return (T[]) arr;
	}
	
	public void clear() {
		arr = new Object[size];
	}
	
	@SuppressWarnings("unchecked")
	public MyList<T> subList(int start, int finish) {
		Object[] rList = new Object[finish-start+1];
		for(int i=start, j=0; i<=finish; i++, j++) {
			rList[j] = arr[i];
		}
		
		return (MyList<T>)(Object)rList;
	}
	
	public boolean contains(T data) {
		boolean isContain = false;
		
		for(Object o : arr) {
			if(data == o) {
				isContain = true;
			}
		}
		
		return isContain;
	}
	

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
