
public class Main {

	public static void main(String[] args) {
		Subject s = new Subject();
		Observer o = new Observer();
		s.setFlag(5);
		s.register(o);
		s.setFlag(10);

	}

}
