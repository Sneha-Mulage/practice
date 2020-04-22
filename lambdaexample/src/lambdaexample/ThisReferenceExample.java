package lambdaexample;

public class ThisReferenceExample {

	
	public void doProcess(int i,Person p) {
		p.process(i);
	}
	
	public void execute() {
		doProcess(10,i->{System.out.println("Value is"+i);
		System.out.println(this);
		});
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisReferenceExample eg=new ThisReferenceExample();
		//eg.execute();
		
			
		eg.doProcess(10,new Person(){

			@Override
			public void process(int i) {
				System.out.println("Value of i is "+i);
				System.out.println(this);
				//this refers to the instance of the object of new Person()
				
			}
		}
		);
	
		//using lambda expression for the above code
			eg.doProcess(10,i->{System.out.println("Value is"+i);
			//System.out.println(this);
			//for lambda expression we cannot use this as it refer to the same class
			});
	
	}
}

