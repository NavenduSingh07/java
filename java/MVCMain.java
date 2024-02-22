// main class  
public class MVCMain {  
       public static void main(String[] args) {  
   
          // fetching the employee record based on the employee_id from the database  
          Employee model = retriveEmployeeFromDatabase();  
   
          // creating a view to write Employee details on console  
          EmployeeView view = new EmployeeView();  
   
          EmployeeController controller = new EmployeeController(model, view);  
   
          controller.updateView();  
   
          //updating the model data  
          controller.setEmployeeName("Navendu");  
          System.out.println("\n Employee Details after updating: ");  
   
          controller.updateView();  
       }  
   
       private static Employee retriveEmployeeFromDatabase(){  
          Employee Employee = new Employee();  
          Employee.setName("Nk");  
          Employee.setId("151");  
          Employee.setDepartment("Developer");  
          return Employee;  
       }  
    }  
