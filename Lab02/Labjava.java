import java.util.Scanner;
public class Labjava {
    // public static void main(String[] args){
            // Scanner obj = new Scanner(System.in);
            // System.out.println("Enter your name : ");
            // String[] name = new String[1024];
            // int continueLoop = 0;
            // int i = -1;
            // do{
            //     i+=1;
            //     if(i >= 1024){
            //         break;
            //     }
            //     if(name.equals(obj)){
            //         System.out.print("Enter "+i+"th name : ");
            //         name[i] = obj.nextLine();  // saving to array
            //         }
            //     else{
            //         System.out.println("Name already exists");
            //     }
            //     System.out.println("Do you want to continue(0 to continue, any other number to stop)");
            //     continueLoop = Integer.parseInt(obj.nextLine());
            //   }while(continueLoop == 0);
            //    // display array to user
            //    System.out.println("Elements in array with size ");
            //    //System.out.println(Arrays.toString(numArray));
            //    for(int j = 0; j <= i; j++){
            //     System.out.print(name[j]+" ");
            //    }
            public static void main(String[] args) {
                String[] names = new String[1024];
                int numNames = 0;
              
              Scanner obj = new Scanner(System.in);
              int opt;
          
              do {
                System.out.println();
                System.out.println("--- Menu --- \n 1.ENTER NAME \n 2.SEARCH NAME \n 3.REMOVE NAME \n 4. ALL NAMES ");
          
                opt = obj.nextInt();
                obj.nextLine();
          
                switch (opt) {
                  case 1:
                  System.out.print("Enter a name: ");
                  String name = obj.nextLine();
              
                  if (name.isEmpty() || numNames == 1024) {
                    System.out.println("Invalid name or maximum limit reached");
                    return;
                  }
              
                  for (int i = 0; i < numNames; i++) {
                    if (names[i].equalsIgnoreCase(name)) {
                      System.out.println("Name already exists");
                      return;
                    }
                  }
              
                  names[numNames++] = name;
                  System.out.println("Name added successfully");
                    break;
                  case 2:
                    System.out.print("Enter a name to search: ");
                    String search = obj.nextLine();
              
                    boolean found = false;
                    for (int i = 0; i < numNames; i++) {
                        if (names[i].equalsIgnoreCase(search)) {
                        System.out.println("Name found at index " + i);
                        found = true;
                        break;
                        }
                    }
              
                    if (!found) {
                        System.out.println("Name not found");
                    }
                    break;
                  case 3:
                    System.out.print("Enter a name to remove: ");
                    String remove = obj.nextLine();
                
                    int index = -1;
                    for (int i = 0; i < numNames; i++) {
                        if (names[i].equalsIgnoreCase(remove)) {
                        index = i;
                        break;
                        }
                    }
                
                    if (index == -1) {
                        System.out.println("Name not found");
                    } else {
                        for (int i = index; i < numNames - 1; i++) {
                        names[i] = names[i + 1];
                        }
                        numNames--;
                        System.out.println("Name removed successfully");
                        }
                    break;
                  case 4:
                    if (numNames == 0) {
                        System.out.println("No names to show");
                        return;
                        }
                        System.out.println("--- Names ---");
                        for (int i = 0; i < numNames; i++) {
                            System.out.println((i + 1) + ". " + names[i]);
                            }
                    break;
                  case 5:
                    System.out.println("Exiting program...");
                    break;
                  default:
                    System.out.println("Invalid option, try again");
                }
              } while (opt != 0);
          
              obj.close();
            }
    
}
