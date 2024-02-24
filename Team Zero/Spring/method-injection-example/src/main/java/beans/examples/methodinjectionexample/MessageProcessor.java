package beans.examples.methodinjectionexample;
import org.springframework.beans.factory.annotation.Autowired;

class MessageProcessor {

    private MessageService messageService;

    @Autowired
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message) {
        messageService.sendMessage(message);
    }
}
