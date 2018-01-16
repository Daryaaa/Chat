import java.util.HashSet;
import java.util.Set;

public class Server implements ConnectionListener {
  private Set<Connection> connections = new HashSet<Connection>();
  public void createConnection(Connection connection) {
    connections.add(connection);
  }

  public void closeConnection(Connection connection) {
    connections.remove(connection);
    connection.close();
  }

  public void connectionException(Connection connection, Exception e) {
    connections.remove(connection);
    connection.close();
    e.printStackTrace();
  }

  public void receiveMessage(Message message) {
    for(Connection connection: connections) {
      connection.send(message);
    }
  }
}
