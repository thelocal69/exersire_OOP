package vehice_office;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class VehiceIO {
	public static final String FILE_NAME = "vehice.txt";
	
	public void write(List<VehiceOfficer> listVehice) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(new File(FILE_NAME));
			oos = new ObjectOutputStream(fos);
			oos.writeObject(listVehice);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			closeStream(fos);
			closeStream(oos);
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public List<VehiceOfficer> read(){
		List<VehiceOfficer> listVehice = new ArrayList<>();
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(new File(FILE_NAME));
			ois = new ObjectInputStream(fis);
			listVehice = (List<VehiceOfficer>) (ois.readObject());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			closeStream(fis);
			closeStream(ois);
		}
		return listVehice;
	}

	private void closeStream(InputStream is) {
		if (is != null) {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void closeStream(OutputStream os) {
		if (os != null) {
			try {
				os.close();
			} catch (IOException	 e) {
				e.printStackTrace();
			}
		}
		
	}
}
