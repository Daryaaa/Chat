public interface ConnectionListener {
  void createConnection(Connection connection);
  void closeConnection(Connection connection);
  void connectionException(Connection connection, Exception e);
  void receiveMessage(Message message);
}
