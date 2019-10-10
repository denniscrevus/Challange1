import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.io.IOException;

public class challange1 {
	public static void main(String[] args){
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

			String ID = in.readLine();
	
			String auxURL = "https://www.ecs.soton.ac.uk/people/" + ID;

			URL u = new URL ( auxURL );

			BufferedReader source = new BufferedReader( new InputStreamReader(u.openStream()));

			String aux = "";

			for( int i = 1; i <= 8; i ++ ) aux = source.readLine();
	
			aux = aux.substring(11, aux.indexOf('|') - 1 );

			out.write( aux );
			out.flush();
			
		}catch( IOException e ){
			e.printStackTrace();
		}
	}
}
	
	

	
	