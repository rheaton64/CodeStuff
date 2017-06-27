package summertech;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class HashMap<T, K> implements Map<T, K>{
	LinkedList[] array;
	int size;
	int resize;
	int hasher = 128;
	boolean[] check = new boolean[128];
	int[] track = new int[128];
	public HashMap(){
		array = new LinkedList[128];
		/*for(int i = 0; i < array.length; i++){
			array[i] = new LinkedList();
		}
		*/
	}

	@Override
	public int size() {

		return size;
	}
	public void reSize(){
		
		System.out.println("resize = "+resize);
			/*if(array[i] != null){
				resize++;
				System.out.println(resize);
				System.out.println("rs");
				check[i] = true;
			}*/
			if(resize >= array.length*0.75){
				LinkedList[] array2 = new LinkedList[array.length*2];
				hasher = array2.length;
				for(int n = 0; n < array.length; n++){
					if(check[n] == true){
						for(int o = 0; o < track[n]; o++){
							if(array[n].get(o) != null){
								int key = (int)((Node) array[n].get(o)).getKey();
								int value = (int)((Node) array[n].get(o)).getValue();
								boolean[] check2 = new boolean[array2.length*2];
								int[] track2 = new int[array2.length*2];
								check2[reHash(key)] = true;
								track2[reHash(key)]++;
								array2[reHash(key)] = new LinkedList();
								array2[reHash(key)].add(new Node(key, value));
								System.out.println("Success 1");
							}
							else{
								break;
							}
						}
					}
				}
				System.out.println("Success 2");
				boolean[] check2 = new boolean[array2.length*2];
				int[] track2 = new int[array2.length*2];
				check = check2;
				track = track2;
				array = array2;
			}
		}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public K get(Object key) {
		LinkedList<Node> list = array[getHash((T)key)];
		for(int i = 0; i < list.size(); i++){
			if((int)list.get(i).getKey() == (int)key){
				size++;
				return (K)list.get(i).getValue();
			}
		}


		return null;
	}

	@Override
	public K put(T key, K value) {
		if(array[getHash(key)] == null){
			array[getHash(key)] = new LinkedList();
			resize++;
			check[getHash(key)] = true;
			track[getHash(key)]++;
;		}
		else{
			System.out.println(getHash(key));
		}
		array[getHash(key)].add(new Node(key, value));
		return value;
	}
	@Override
	public K remove(Object key) {
		LinkedList<Node> list = array[getHash((T)key)];
		for(int i = 0; i < list.size(); i++){
			if((int)list.get(i).getKey() == (int)key){
				K val = (K)list.get(i).getValue();
				size--;
				list.remove(i);
				return val;
			}
		}
		return null;
	}

	@Override
	public void putAll(Map m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getHash(T key){
		return (key.hashCode()*3%hasher);
		//return (int)key;
	}
	public int reHash(int key){
		return (key*3%hasher);
	}
}