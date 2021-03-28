
public interface ISubject {

	public void register(Observer ob);
	
	public void unregister(Observer ob);
	
	public void notifyObsever();
	
}
