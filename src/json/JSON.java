package json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.*;

public class JSON {

	public static JSONArray jsonArray = new JSONArray();
	
	public static void jsonBase() {
		
		File base = new File("C:/ProgramData/ASP/base.json");
		if(!base.exists()) {
			try {
				 new File("C:/ProgramData/ASP").mkdir();
		         FileWriter fwBase = new FileWriter("C:/ProgramData/ASP/base.json");
		         fwBase.close();
		      } catch (IOException e) {
		         e.printStackTrace();
		      }
		}
	}
}
