package org.example.collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import org.example.collection.Collection;

public class Demo {

	public static void main(String[] args) {
		//implementing generic using collections
		//Specifying the type of the collection
		Set<Collection> set=new HashSet<Collection>();
		set.add(new Collection(UUID.randomUUID().toString(), "Coll-1", 190));
		set.add(new Collection(UUID.randomUUID().toString(), "Coll-1", 190));
		set.add(new Collection(UUID.randomUUID().toString(), "Coll-1", 190));
		set.add(new Collection(UUID.randomUUID().toString(), "Coll-1", 190));
		set.add(new Collection(UUID.randomUUID().toString(), "Coll-1", 190));
		System.out.println(set);
		List<Collection> list=new ArrayList<Collection>();
		list.add(new Collection(UUID.randomUUID().toString(), "Coll-1", 190));
		list.add(new Collection(UUID.randomUUID().toString(), "Coll-1", 190));
		list.add(new Collection(UUID.randomUUID().toString(), "Coll-1", 190));
		list.add(new Collection(UUID.randomUUID().toString(), "Coll-1", 190));
		list.add(new Collection(UUID.randomUUID().toString(), "Coll-1", 190));
		System.out.println(list);
		Set<Integer> set1=new HashSet<Integer>();
		set1.add(10);
		set1.add(10);
		set1.add(9);
		set1.add(20);
		set1.add(8);
		set1.add(50);
		System.out.println(set1);
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(10);
		list1.add(9);
		list1.add(20);
		list1.add(8);
		list1.add(50);
		System.out.println(list1);
		
	}
	}
