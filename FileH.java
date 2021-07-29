import java.io.File;

public class Service {

	public static void main(String[] args) {
		
		File fobj = new File("D:\\JAVA-EE-workspace\\E-Portal\\src\\main\\webapp\\Courses\\JAVA");
		
		boolean exist = fobj.exists();
		
		if(exist)
		{
			File[] fileitems = fobj.listFiles();
			
			for(File item: fileitems)
			{
				if(item.isFile())
				{
					String Fname = item.getName();
					int dot = Fname.lastIndexOf(".");
					String str = Fname.substring(dot+1);
					
					if(str.equals("mp4"))
					{
						System.out.println("File read");
						System.out.println(Fname);
						System.out.println();
					}
				}
			}
		}
		
	}

}
