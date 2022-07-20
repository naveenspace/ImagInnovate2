    package src.Response; 

	import org.apache.camel.Exchange;
	import src.Employee;	
      
    public class Response {  
     
	 public void emprequest(Exchange exchange)
	 {
	 
	Employee em = new Employee(); 
	
	em = (Employee)exchange.getProperty("body"); // if Frontend is passing data
	
	// assuming We are passing body in api call instead of "body" property which also has same data
	List<Employee> emp = Arrays.asList( 
						new Employee(12,"ram","ab","ram@gmail.com",120,8181891911,20000),
						new Employee(15,"raj","bc","raj@gmail.com",121,8181891912,50000),
						new Employee(20,"ashok","bd","ashok@gmail.com",122,8181891913,100000)
						);
	
	JSONObject x = new JSONObject();
	x.put("empdetails",emp);
	
	
	exchange.getIn().setHeader(content-type,application/json);
	exchange.getIn().setBody(x);
	 	 
	 
	 }
	 
	 public void empresponse(ApiResponse apiresponse,Exchange exchange)
	 {
	 
	 
	 JSONObject object = new JSONObject();
	 JSONArray key = object.names();
	 
	 
	 int count = Object.keys(key).length;

			for(int p=0;p<count;p++)
			{
			int empId = key.getString(p); // takes first employee json object which has all his information
			JSONObject value = object.getString(empId); // based on empoyee id it will retrieve his/her respective details
			System.out.println(value);
			
			}
		
	 
	 }

    }  


