package chatProtocol;

public interface IService {
    public User login(User u) throws Exception;
    public void logout(User u) throws Exception; 
    public void post(PaqueteDatos message, String idEmisor, String idReceptor);
    public User get(String id);
}
