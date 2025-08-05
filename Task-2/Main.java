import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Student> list=new ArrayList<Student>();

    // Returns index number if available
     public int check(int check){
        int c=0;
        int index=0;
        boolean found = false;
        for (Student s : list) {
            if (s.Id == check) {
                c+=1;
                found = true;
                break;
            }
            index++;
        }
        if(c==0){
            return -1;
        }
        else {
            return index;
        }
    }

    //Creates single or multiple records at a time
    public void Add(){
            System.out.println("How many Records want to add");
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                System.out.println("Enter Student "+i+" details");
                int k=0;
                while(true){
                    k++;
                    System.out.println("Enter Id");
                    int Id=sc.nextInt();
                    if(check(Id)>=0 &&k<=5){
                        System.out.println("Id already Exists in records please re-enter,you have "+(5-k)+"tries left");
                        continue;
                    } else if(k>5){break;}
                    else{
                        System.out.println("Enter name");
                        String name=sc.next();
                        System.out.println("Enter marks");
                        int marks=sc.nextInt();
                        list.add(new Student( Id, name,marks));
                        break;
                    }
                 }
             }
    }

    // Display the Records
    public void display(){
        if(list.isEmpty()){
            System.out.println("Currently no Student records are available to display :)");
        }
        else{
            System.out.println("Current Student Records are:-");
            System.out.println("------------------------------");
             Iterator itr =list.iterator();
                while(itr.hasNext()){
                    System.out.println(itr.next().toString());
                }
            System.out.println("------------------------------");
        }

    }

    // Updates the Record
    public void Update(){
        System.out.print("Enter the Id you want to update: ");
        int id=sc.nextInt();
        id=check(id);
        if(id>=0){
             System.out.println("Select option you want to update :");
             System.out.println("1. Id   2.Name  3.Marks");
             int choice=sc.nextInt();
            switch(choice){
                case 1:
                int k=0;
                    while(true){
                        k++;
                        System.out.println("Enter new Id");
                        int new_id=sc.nextInt();
                        int dex= check(new_id);
                        if (dex>=0&&k<=5){
                            System.out.println("Id already exists please enter new Id you have"+(5-k)+"tries left");
                            continue;
                        }
                        else if(k>5){
                            break;
                        }
                        else{
                            list.get(id).Id=new_id;
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter new Name: ");
                    String name=sc.next();
                 list.get(id).name=name;
                 break;
                case 3:
                    System.out.print("Enter new Marks: ");
                    int marks=sc.nextInt();
                    list.get(id).marks=marks;
                    break;
            }
        }
        else{
            System.out.println("Id doesn't Exist in Records");
        }
    }

    // Delete the Records
    public void delete(){
        System.out.println("1. Delete particular record         2. Remove all Records");
        System.out.print("Enter your Choice:");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Enter the Id of the Record");
            int id=sc.nextInt();
            id=check(id);
            if(id>=0){
                list.remove(id);
                System.out.println("Successfully deleted the Record");
            }
            else{
                System.out.println("Id doesn't Exist");
            }
        }
        else if(choice==2){
            list.clear();
            System.out.println("All records have been Successfully removed");
        }
        else{
            System.out.println("Wrong Choice Entered");
        }
    }


        public static void main(String[] args) {
            Main obj=new Main();
            System.out.print("Enter Student data");
            while(true){
                System.out.println("Do you want to perform Records operations if Yes 'Y' else 'N' ");
                char option=sc.next().charAt(0);
                option=Character.toLowerCase(option);
                if(option=='y'){
                    System.out.println("1. Add a new Record     2. Display the Records");
                    System.out.println("3. Update the Record     4. Delete the records");
                    System.out.print("Enter Operation to perform on records :");
                    int choice =sc.nextInt();
                     switch(choice){
                        case 1: obj.Add(); 
                            break;
                        case 2: obj.display();
                            break;
                        case 3: obj.Update();
                            break;
                        case 4: obj.delete();
                            break;
                        default: System.out.println("You Entered Wrong choice");

                     }
                }
                else{
                    System.out.println("Thanks for using this Program");
                    break;
                }
            }

    }
}
