import java.util.*;
import java.io.*;
public class PhoneDirectory {
    public static void main(String[] args) {
      try {
    	  FileInputStream fs = new FileInputStream("E:\\RAJU\\phone.txt");
          Scanner sc = new Scanner(fs).useDelimiter("\\s+");
          Hashtable<String, String>ht = new Hashtable<String, String>();
          String[] arrayList;
          String a;
          System.out.println("Welcome To Phone Directory");
          System.out.println("Phone numbers are");
        while (sc.hasNext())  {
                a = sc.nextLine();
				arrayList = a.split("\\s+");
				ht.put(arrayList[0], arrayList[1]);
				System.out.println(arrayList[0] + ":" + arrayList[1]);
        }
System.out.println("Welcome To Phone Directory");
System.out.println("MENU");
System.out.println("1.Search by Name");
System.out.println("2.Search by Mobile");
System.out.println("3.Exit");
        String opt = "";
        String name, mobile;
        Scanner s = new Scanner(System.in);
        while (opt != "3") {
        	System.out.println("Enter Your Option (1,2,3): ");
            opt = s.next();
            switch (opt)  {
                case "1":
                	System.out.println("Enter Name");
                    name = s.next();
                    if (ht.containsKey(name))  {
                    System.out.println("Mobile is " + ht.get(name));
                     } else {
                    System.out.println("Not Found");
                     }
                     break;
                 case "2":
                	 	System.out.println("Enter mobile");
                        mobile = s.next();
                        if (ht.containsValue(mobile)) {
                        for (Map.Entry e : ht.entrySet()) {
                        if (mobile.equals(e.getValue()))  {
                        System.out.println("Name is " + e.getKey());
                        }
                        }
                        } else {
                        System.out.println("Not Found");
                        }
                        break;
                  case "3":
                        opt = "3";
                        System.out.println("Menu Successfully Exited");
                        break;
                  default:
                	  	System.out.println("Choose Option betwen 1 and Three");
                        break;          
            }
        }
      } catch (Exception ex) {
System.out.println(ex.getMessage());
        }
    }
}
