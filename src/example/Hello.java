
package example;

import org.apache.commons.lang.WordUtils;

public class Hello {
    public static void main(String[] args) {
        String  message = "hello ivy !";
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName() 
                                + " : " + WordUtils.capitalizeFully(message));
        int monmax=0; 
		int i,nb; 
		try (CSVReader reader=new CSVReader(new FileReader("data.csv"))){ 
			List<String[]> myEntries= reader.readAll(); 
			for(i=0;i<myEntries.size();i++)
			{ 
				nb=Integer.parseInt(myEntries.get(i)[0]); 
				System.out.println("nb lu : " + nb);
				if(monmax<nb)
				{ 
					monmax=nb; 
				} 
			} 
			System.out.println("Max = : " + monmax); 
		} 
    }
}
   