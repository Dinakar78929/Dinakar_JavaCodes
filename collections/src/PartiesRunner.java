import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartiesRunner {

	public static void main(String[] args) {
		Collection<String> parties=new ArrayList<String>();
		parties.add("bjp");
		parties.add("congress");
		parties.add("jds");
		parties.add("upp");
		
		
		for(String party:parties)
		{
			System.out.println(party);
		}
		
		
		System.out.println("-------After conversion------");
//		Collection<String> convertedParties=
		parties
		.stream()
		.map(ref->ref.toUpperCase())
		.collect(Collectors.toList());
//		.forEach(element->System.out.println(element));
	
		
		
//		.collect(element-> System.out.println(element) );
		
	}

}
