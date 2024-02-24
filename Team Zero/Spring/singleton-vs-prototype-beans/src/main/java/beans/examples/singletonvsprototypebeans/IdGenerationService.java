package beans.examples.singletonvsprototypebeans;

import org.springframework.stereotype.Service;
import org.springframework.context.ApplicationContext;
@Service
public class IdGenerationService {

    private final ApplicationContext context;

    public IdGenerationService(ApplicationContext context) {
        this.context = context;
    }
    public int getNextSingletonId() {
        SingletonIdGenerator singletonIdGenerator = context.getBean(SingletonIdGenerator.class);
        return singletonIdGenerator.getNextId();
    }

    public int getNextPrototypeId() {
        PrototypeIdGenerator prototypeIdGenerator = context.getBean(PrototypeIdGenerator.class);
        return prototypeIdGenerator.getNextId();
    }
}
