import edu.nvcc.csc.csc200.Person;

public class PersonDriver {

	public static void main(String[] args) {
		Person tanes = new Person();
		System.out.println(tanes);
		tanes.setName("Tanes");
		tanes.setAge(30);
		System.out.println(tanes.getName());
		System.out.println(tanes.getAge());
		
		Person celeste = new Person("Celeste" , 45);
		if(tanes.getName().equals(celeste.getName()) && tanes.getAge() == celeste.getAge()) {
			System.out.println("two persons name and age are equal.");
		}else{ 
			System.out.println("two persons name and age are not equal.");
		}
		if(tanes.getAge() > celeste.getAge()){
			System.out.println("tanes is older then celeste");
		}else{ 
			System.out.println("Celeste is older then Tanes");
		}
	}

}
