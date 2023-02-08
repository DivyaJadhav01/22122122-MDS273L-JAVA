import java.util.Scanner;
public class Lab02 {
  public static void main(String[] args) {
    int len = 1024;
    String[] name = new String[len];
    int numNames = 0;
    Scanner obj = new Scanner(System.in);
    int opt;
    do {
      System.out.println("--- Menu --- \n 1.Enter a name \n 2.Search name \n 3.Remove name \n 4.Show all names \n 5.Exit program ");
      opt = Integer.parseInt(obj.nextLine());
      switch (opt) {
        case 1:
          for(int i = 0; i <= len; i++){
              
            System.out.print("Enter a name : ");
            name[i] = obj.nextLine();  // saving to array
            System.out.println("Name successfully added 😁");              
              
          }
          
          break;
        case 2:
          System.out.print("Enter a name to search: ");
          String sName = obj.nextLine();
          for (int j = 0; j < len; j++) {
            if (name[j].equalsIgnoreCase(sName)) {
              System.out.println("Name found at index " + j);
            }
            else{
              System.out.println("Name not found!🥺");
            }
        }
          break;
        case 3:
          System.out.println("Enter a name you want to remove : ");
          String rName = obj.nextLine();
          int index = -1;
          for(int i = 0; i <= len-1; i++){
            if(name[i].equalsIgnoreCase(rName)){
              index = i;
            }
          if(index == -1){
            System.out.println("Name not found! 👀");
          }
          else{
            for(i = index;i <= len-1; i++){
              name[i] = name[i +1];
              System.out.println("Name removed successfully 😉");
            }
            len--;
          }

          }
          break;
        case 4:
          System.out.println("List of all names : ");
          for(int i = 0; i <= len; i++){
            System.out.println((i + 1) + "."+ name[i]);
            }
          break;
        case 5:
          System.out.println("Exiting program...🫤");
          break;
        default:
          System.out.println("Invalid option, try again👎🏻");
      }
    } while (opt != 5);

    obj.close();
  }
}


      
    