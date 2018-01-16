public interface Connection {
  void send(Message message);
  void close();
}
