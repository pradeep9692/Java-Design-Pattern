
public class Proxy extends Subject{

	ConcreteSubject cs;
	@Override
	public void doSomeWork() {
		System.out.println("proxy call happening now");
		// lazy initialization
		if(cs==null) {
			cs = new ConcreteSubject();
		}
		cs.doSomeWork();
	}

}
