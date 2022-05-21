package json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.*;

public class JSON {

	public static JSONArray jsonArray = new JSONArray();
	public static File base;
	
	public static void jsonBase() {
		
		base = new File("C:/ProgramData/ASP/base.json");
		if(!base.exists()) {
			try {
				 new File("C:/ProgramData/ASP").mkdir();
		         FileWriter fwBase = new FileWriter(base);
		         fwBase.close();
		      } catch (IOException e) {
		         e.printStackTrace();
		      }
		}
	}
}
