package capiscum.api.command;

import java.util.function.Supplier;

public interface CommandSender {

    void sendMessage(String msg);

    default void sendMessage(String... msg) {
        for (String s : msg) {
            sendMessage(s);
        }
    }

    default void sendMessage(Supplier<String> message) {
        sendMessage(message.get());
    }

    String getName();

}
