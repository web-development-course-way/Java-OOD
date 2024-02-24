package beans.examples.singletonvsprototypebeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeIdGenerator {
    private int nextId = 1;

    public int getNextId() {
        return nextId++;
    }
}
