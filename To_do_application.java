import java.util.ArrayList;
import java.util.Scanner;

public class To_do_application {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("========== welcome to CONSOLE BASED TO DO APPLICATION ==========");
        while(true){
            System.out.println("1.Add task");
            System.out.println("2.View task");
            System.out.println("3.Delete task");
            System.out.println("4.Exit");
            System.out.println();
            System.out.println("Enter your option : ");

            int choice = scan.nextInt();
            scan.nextLine();

            switch(choice){
                case 1:
                System.out.println("Enter your tasks (type -1 to stop)");
                while(true){
                    String task = scan.nextLine();
                    if(task.equals("-1")){
                        break;
                    }

                    if(!task.trim().isEmpty()){
                        list.add(task);
                    }else{
                        System.out.println("Invalid task to add");
                    }
                }
                System.out.println("Tasks added successfully");
                System.out.println();
                break;


                case 2:
                if(list.isEmpty()){
                    System.out.println("No tasks added yet");
                }else{
                    System.out.println("---------- Tasks list ---------");
                    for(int i=0;i<list.size();i++){
                        System.out.println((i+1)+"."+list.get(i));
                    }
                }
                System.out.println();
                break;


                case 3:
                if(list.isEmpty()){
                    System.out.println("No tasks to delete");
                }else{
                    System.out.println("---------- Tasks list ----------");
                    for(int i=0;i<list.size();i++){
                        System.out.println((i+1)+"."+list.get(i));
                    }

                    System.out.println("Enter task number to remove(eg:-2 3 4 ) or -1 to cancel");
                    String input = scan.nextLine().trim();
                    if(input.equals("-1")){
                        System.out.println("Remove cancelled");
                        break;
                    }

                    String str_num_arr[] = input.split(" ");
                    ArrayList<Integer> toRemove = new ArrayList<>();

                    for(String str : str_num_arr){
                     try{
                        int n = Integer.parseInt(str);
                        if(n >= 1  && n <= list.size()){
                            toRemove.add(n-1);
                        }else{
                            System.out.println("Invalid task number : "+n);
                        }
                     }catch(NumberFormatException e){
                        System.out.println("Invalid input: " + str);
                     }
                    }

                    toRemove.sort((a,b)->b-a);
                    for(int index : toRemove){
                        System.out.println("Removed: " + list.remove(index));
                    }
                }
                break;
                

                case 4:
                System.out.println("Exiting CONSOLE BASED TO DO APPLICATION ,good bye buddy !!!!!");
                scan.close();
                System.exit(0);
                break;

            }
        }
    } 
}
     
