class Student{
   public int Id;
   public int marks;
   public String name;

    Student(int Id,String name,int marks) {
        this.Id=Id;
        this.name=name;
        this.marks=marks;
    }

      public String toString() {
        return "ID: " + Id + ", Name: " + name + ", Marks: " + marks;
    }
   
}