import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject{

	List<Observer> observers = new ArrayList();
	private int flag;
	
	
	public void setFlag(int flag) {
		System.out.println("changing value of flag: "+flag);
		this.flag = flag;
		notifyObsever();
		
	}

	@Override
	public void register(Observer ob) {
		observers.add(ob);
		
	}

	@Override
	public void unregister(Observer ob) {
		observers.remove(ob);
		
	}

	@Override
	public void notifyObsever() {
		for(Observer o: observers) {
			o.update();
		}
		
	}

}
