package Day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            FileInputStream fis = new FileInputStream("user-image.jpg");
            FileOutputStream fos = new FileOutputStream("copy.jpg");

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
	}

}
