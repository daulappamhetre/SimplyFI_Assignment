package SimplyFI.Genericutilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility
{
	public String FetchDataPropperty(String key) throws IOException
	{
		FileInputStream file=new FileInputStream(Iconstants.filepath);
		Properties property=new Properties();
		property.load(file);
		String value=property.getProperty(key);
		return value;

}


}