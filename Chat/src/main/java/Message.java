import java.io.Serializable;

public interface Message extends Serializable {
  String getNick();
  String getContent();
}
