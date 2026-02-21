package DSA_Day_5;

public interface Compare<T> {
	int compare(T a, T b);
}
interface Key_Extractor < T, K> {
	K extract(T obj);
}
class Custom_Comparator {
	static int compare (Object a, Object b) {
		if(a == b) {
			return 0;
		}else if(a == null) {
			return -1;
		}
		else if(b == null) {
			return 1;
		}
		else if(a instanceof Integer && b instanceof Integer) {
			return (int)a - (int)b;
		}
		if(a instanceof String && b instanceof String) {
			String s1 = (String) a;
			String s2 = (String) b;
			int len = Math.min(s1.length(), s2.length());
			for(int i = 0; i < len; i++) {
				if(s1.charAt(i) != s2.charAt(i));
				return s1.charAt(i) - s2.charAt(i);
			}
			return s1.length() - s2.length();
		}
		throw new RuntimeException("Unsupported Type");
	}
}
class Sorter<T>{
	 T[] arr;
	 Key_Extractor < T, ?>extractor;
	 boolean ascending = true;
	 public Sorter(T[] arr, Key_Extractor<T, ?> extractor) {
		this.arr = arr;
		this.extractor = extractor;
	 }
	 void sort(){
		int n = arr.length;
		for(int i=0; i<n-1; i++){
			for(int j=0; j<n-i-1; j++){
				Object v1 = extractor.extract(arr[j]);
		        Object v2 = extractor.extract(arr[j+1]);
		        int cmp = Custom_Comparator.compare(v1, v2);
		        if((ascending && cmp > 0) || !ascending && cmp < 0){
		        	T temp = arr[j];
		            arr[j] = arr[j+1];
		            arr[j+1] = temp;
		        }
		    }
		}
	 }
	 Sorter<T> asc() {
	    ascending = true;
	    sort();
	    return this;
	 }
	 Sorter<T> desc() {
	    ascending = false;
	    sort();
	    return this;
	 }
}
class ArrayWrapper<T> {
    T[] arr;
    public ArrayWrapper(T[] arr) {
        this.arr = arr;
    }
    Sorter<T> sort(Key_Extractor<T, ?> extractor) {
        return new Sorter<>(arr,extractor);
    }
}