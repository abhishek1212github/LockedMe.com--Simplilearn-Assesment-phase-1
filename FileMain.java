package SimplilearnAssessment;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class FileMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int ch;
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("**********CHOOSE OPTION***********");
			System.out.println("1. File names in an ascending order");
			System.out.println("2. Perform Business-level Operations ");
			System.out.println("3. Close the application");
			
			
			//C:\Users\KIIT\eclipse-workspace\first\src\SimplilearnAssessment\AtextFile
			
			ch = sc.nextInt();
			switch(ch) {
			case 1: try {
					SortFile_AccendingOrder();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case 2:
				boolean x=true;
				
				while(x)
				{
					System.out.println("****Press 10/20/30/40 for respective operations****");
					System.out.println("10. Add a file to the existing directory list");
					System.out.println("20. Delete a file from the existing directory list");
					System.out.println("30. Search a file from the main directory");
					System.out.println("40. Navigate back to the main context");
					int num;
					num=sc.nextInt();
					
					switch(num) 
					  {	
					    case 10: 
					    	newFile();
					      break;
					    case 20: 
					    	Deletefile();
					      break;
					    case 30: 
					    	SearchFile();
					      break;
					    case 40: x=false;
					      break;
					    default: System.out.println("Please enter a correct choise:");
					  }
				}
				break;
				
			case 3: System.out.println("***THANK YOU***");
				return;
				
			default:System.out.println("Please enter a correct choise:");
			}
			
		}
		
		

	}
	
	public static void SortFile_AccendingOrder() throws FileNotFoundException
    {
        
        File folder = new File("C:\\Users\\KIIT\\eclipse-workspace\\first\\src\\SimplilearnAssessment");
        if(folder.isDirectory())
		 {
		     File[] fileList = folder.listFiles();

		     Arrays.sort(fileList);
		     for(File file:fileList)
		     {
		         System.out.println(file.getName());
		     }           
		 }
    }
	
	public static void newFile() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter new file name");
		String fileName=sc.nextLine();
		
		fileName ="C:\\Users\\KIIT\\eclipse-workspace\\first\\src\\SimplilearnAssessment\\"+""+fileName+".txt";
	
		try {
		       File f1 = new File(fileName);
		       if(f1.createNewFile()) {
		           System.out.println("New file created successfully");
		       }else {
		           System.out.println("File already exists");
		       }
		   }catch (Exception e) {
		    // TODO: handle exception
		       System.out.println(e);
		}
		
	}
	
	public static void Deletefile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file name to delete it:");
		String fileName=sc.nextLine();
		
		fileName ="C:\\Users\\KIIT\\eclipse-workspace\\first\\src\\SimplilearnAssessment\\"+""+fileName;
	
		try {
		       File f1 = new File(fileName);
		       if(f1.delete()) {
		           System.out.println("File Deleted successfully");
		       }else {
		           System.out.println("File Doesn't exists");
		       }
		   }catch (Exception e) {
		    // TODO: handle exception
		       System.out.println(e);
		}
		
	}
	
	public static void SearchFile() throws Exception{

    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter file name to be search:");
		String name=sc.nextLine();
      
        File directory = new File("C:\\Users\\KIIT\\eclipse-workspace\\first\\src\\SimplilearnAssessment\\");
  
        String[] flist = directory.list();
        int flag = 0;
        if (flist == null) {
            System.out.println("Empty directory.");
        }
        else {
  
            for (int i = 0; i < flist.length; i++) {
                String filename = flist[i];
                if (filename.equalsIgnoreCase(name)) {
                    System.out.println(filename + " found");
                    flag = 1;
                }
            }
        }
  
        if (flag == 0) {
            System.out.println("File Not Found");
        }

	}
	

}
