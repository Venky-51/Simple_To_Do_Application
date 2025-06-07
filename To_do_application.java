package Simple_To_Do_List;

import java.util.ArrayList;
import java.util.Scanner;

public class To_do_application{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
ArrayList<String> list = new ArrayList<>();

while(true){
System.out.println("====TO DO LIST====");
System.out.println("1.Add task");
System.out.println("2.View Task");
System.out.println("3.Delete Task");
System.out.println("4.Exit");

System.out.println();
System.out.println("Enter your choice : ");
int choice = scan.nextInt();
scan.nextLine();

switch(choice){
case 1:
System.out.println("Enter the tasks to add and press -1 to stop : ");
while(true){
String task = scan.nextLine();
if(task.equals("-1")){
break;
}

if(!task.trim().isEmpty()){
list.add(task);
//System.out.println("Task added : "+task);
}else{
System.out.println("Empty task can't be added, try again");
}
}
System.out.println("All tasks added to the list");
System.out.println();
break;


case 2:
if(list.isEmpty()){
System.out.println("No tasks added yet...");
}else{
System.out.println("-----Your tasks In the List-----");
for(int i=0;i<list.size();i++){
System.out.println((i+1) + "." + list.get(i));
}
}
System.out.println();
break;


case 3:
if(list.isEmpty()){
System.out.println("No tasks to Remove.");
}else{
System.out.println("-----Your tasks-----");
for(int i=0;i<list.size();i++){
System.out.println((i+1)+"."+list.get(i));
}

System.out.println("Enter the task number to remove");
int taskNumber = scan.nextInt();
scan.nextLine();

if(taskNumber >=1 && taskNumber <= list.size()){
String removedTask = list.remove(taskNumber - 1);
System.out.println("Task : " + removedTask + " removed successfully! " );
}else{
System.out.println("Invalid Task number");
}
}
System.out.println();
break;


case 4:
System.out.println("Exiting To-Do list,  good bye buddy !!");
scan.close();
System.exit(0);
break;
}
}



}
}