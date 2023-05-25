package java8feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

//Stream APi - streams represnt sequence of object from source which supports aggregation operations
// new additional package by java (java.util.streams)
public class StreamApi
{
	public static void main(String[] args)
	{
		//create a stream
		Stream<String> st = Stream.of("a","b");
		st.forEach(System.out::println);

		//create a  stream from  source collection
		Collection<String> collection = Arrays.asList("java","python","mysql");
		Stream<String> st2 = collection.stream();
		st2.forEach(System.out::println);

		//create a  stream from  source list
		List<String> ls = Arrays.asList("j","p","m","m");
		Stream<String> st3 = ls.stream();
		st3.forEach(System.out::println);


		//create a  stream from  source set
		Set<String> set = new HashSet<>(ls);
		Stream<String> st4 = set.stream();
		st4.forEach(System.out::println);

		//create a  stream from  source Array
		String[] arr = {"a","b","c","d"};
		Stream<String> arraystream = Arrays.stream(arr);
		arraystream.forEach(System.out::println);
	}
}
