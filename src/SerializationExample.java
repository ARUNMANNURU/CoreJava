import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class SerializationExample implements Serializable{

	/**
	 * @param args
	 * @throws IOException 
	 */
	private int width;
	private int height;

	public void setWidth(int w){
		this.width = w;
	}
	public void setHeight(int h){
		this.height = h;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SerializationExample se = new SerializationExample();
		se.setHeight(12);
		se.setWidth(23);
		try{
		FileOutputStream fos = new FileOutputStream("file");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(fos);
		oos.close();
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}
	}
}
