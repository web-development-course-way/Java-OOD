package beans.examples.singletonvsprototypebeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SingletonIdGenerator {

    private int nextId = 1;

    public int getNextId() {
        return nextId++;
    }
}
