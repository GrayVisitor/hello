package 简单购物系统;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.text.JTextComponent;

import net.sf.json.JSONObject;

public class User {

		private String name;
		private String mm;
		private String qrmm;
		private String sj;
		private JTextComponent textmm;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMm() {
			return mm;
		}
		public void setMm(String mm) {
			this.mm = mm;
		}
		public String getQrmm() {
			return qrmm;
		}
		public void setQrmm(String qrmm) {
			this.qrmm = qrmm;
		}
		public String getSj() {
			return sj;
		}
		public void setSj(String sj) {
			this.sj = sj;
		}
	
	


public void saveuser(String name, String mm,String sj){
	HashMap map=new HashMap();
	map.put("Name",name);
	map.put("Mm",mm);
	map.put("Sj", sj); 
	JSONObject json=new JSONObject();
	json=json.fromObject(map);
	System.out.println(json);
	String str1=json.toString();
	try{
		FileWriter writer=new FileWriter("user.json",true);
		writer.write(str1);
		writer.write("\r\n");
		writer.close();
	 }
	 catch(IOException e){
		 //TOOO Auto-generated catch block
		 e.printStackTrace();
	 }
	}

 

public boolean isregistuser(String name,String mm){
	try {
		FileReader read=new FileReader("user.json");
		BufferedReader br=new BufferedReader(read);
		String str;
		
		try {
			while((str=br.readLine())!=null)
			{
				if(str.startsWith("{"))
				{
					System.out.print(str);
					JSONObject jsonob=new JSONObject();
					jsonob=jsonob.fromObject(str);
					String readfilename=jsonob.getString("Name").toString();
					String readfilemm=jsonob.getString("Mm").toString();
					if(name.equals(readfilename)&&mm.equals(readfilemm))
					{
						return true;
					} 
				}
			}return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();  
		}
	return false;
   }




/*public boolean nameeequals(String name) {
	// TODO Auto-generated method stub


		
		try {
			FileReader read = new FileReader("user.json");
			BufferedReader br=new BufferedReader(read);
			String str;
			while((str=br.readLine())!=null);
			{
				JSONObject jsonob=new JSONObject();
				 jsonob=jsonob.fromObject(str);
				String readfilename=jsonob.getString("name").toString();
				if(name.equals(readfilename));
				{
					return true;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	
	return false;
}
}
*/


public boolean nameequals(String name)
{
	   try {
		FileReader read=new FileReader("user.json");
		BufferedReader br=new BufferedReader(read);
		String str;
		try {
		while((str=br.readLine())!=null)
		{
			JSONObject jsonob=new JSONObject();
			jsonob=jsonob.fromObject(str);
			String readfileusername=jsonob.getString("Name").toString();
			
			if(name.equals(readfileusername))
			{
				return false;
			}
			
	    }		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();  
		}
	return true;	
}

}


