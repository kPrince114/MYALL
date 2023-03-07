package Question4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*What are the features of Stream API in Java explain some of the intermediate
and terminal methods of Stream object with one example.

1.A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
2.Streams don’t change the original data structure, they only provide the result as per the pipelined methods.

intermediate method:
1.filter();
2.map();

terminal methods
1.max();
2.min();
3.count();
4.forEach();



*/
public class main1 {

	public static void main(String[] args) {
	
		//intermediate method::-
		List<String> name=Arrays.asList("prince","raj","mohan","ashish");
		List<String> sorna=name.stream().filter(na->na.length()>5).collect(Collectors.toList());
		System.out.println(sorna);
		
		//terminal methods
		name.forEach(S->System.out.println(S));
		
	}

}
