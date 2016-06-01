package observer.aufgabe1;


public class ChatTest {
    public static void main(String[] args) {
        ChatClient client = new ChatClient();
        IChatBeobachter anzeige0 = new Anzeige();
        IChatBeobachter logWriter0 = new LogWriter();
        client.registriereBeobachter(anzeige0);
        client.registriereBeobachter(logWriter0);
        client.schreibeNachricht("hello world", "foobar");
        client.schreibeNachricht("bye world", "foobar");
        client.schreibeNachricht("hello world", "edutilos");
        client.schreibeNachricht("bye world", "edutilos");

    }
}
