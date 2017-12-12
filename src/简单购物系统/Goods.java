package 简单购物系统;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import net.sf.json.JSONObject;

public class Goods {
	private String id;
	private String name;
	private String img;
	private float price;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void savegoods()
	{
		HashMap map=new HashMap();
		map.put("ID",this.id);
		map.put("Name",this.name);
		map.put("Img",this.img);
		map.put("Price",this.price);
		JSONObject json=new JSONObject();
		json=json.fromObject(map);
		String str1=json.toString();
		System.out.println(json);
		try {
			FileWriter writer=new FileWriter("goods.json",true);
			writer.write(str1);
			writer.write("\r\n");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Goods  getgoodsby(String ID)
	{
		
		FileReader reader;
		try {
			reader=new FileReader("goods.json");
			BufferedReader br=new BufferedReader(reader);
			String str;
			try {
				while((str=br.readLine())!=null)
				{
					JSONObject jsonobj=new JSONObject();
					jsonobj=jsonobj.fromObject(str);
					String objID=jsonobj.get("ID").toString();
					if(ID.equals(objID))
					{
						this.id=objID;
						this.name=jsonobj.get("Name").toString();
						this.img=jsonobj.get("Img").toString();
						this.price=Float.parseFloat(jsonobj.get("Price").toString());
						return this;
						
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
	/*public Goods getgoodsid(String ID) {
		FileReader reader;
		try {
			reader=new FileReader("goods.json");
			BufferedReader br=new BufferedReader(reader);
			String str;
			try {
				while((str=br.readLine())!=null) {
					JSONObject jsonobj=new JSONObject();
					jsonobj=jsonobj.fromObject(str);
					String objID=jsonobj.getString("ID").toString();
					if(ID.equals(objID)){
						this.id=objID;
						this.name=jsonobj.get("Name").toString();
						//System.out.print(jsonobj.get(""));
						this.img=jsonobj.get("Img").toString();
						this.price=Float.parseFloat(jsonobj.getString("Price"));
						return this;
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}*/


