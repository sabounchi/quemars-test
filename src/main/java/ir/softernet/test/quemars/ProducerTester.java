package ir.softernet.test.quemars;

import ir.softernet.lib.quemars.Priority;
import ir.softernet.lib.quemars.QuemarsConfig;
import ir.softernet.lib.quemars.QuemarsProducer;

import java.util.Random;

/**
 * Created by saman on 4/19/16.
 */
public class ProducerTester {

    private static final Random RANDOM = new Random();

    private QuemarsProducer producer;

    public ProducerTester() {
        this.producer = new QuemarsProducer(new QuemarsConfig(7, "test"));
    }

    public QuemarsProducer getProducer() {
        return producer;
    }

    public static void main(String[] args) {
        final ProducerTester producerTester = new ProducerTester();

        for (int i=0; i<1000000; i++) {

            final int rnd = RANDOM.nextInt(3);
            final Priority priority = ((rnd==0) ? Priority.HIGH : (rnd==1 ? Priority.MEDIUM : Priority.LOW));


            final String msg = priority.getIdentifier() + "-test-msg-" + i;
            producerTester.getProducer().submit(msg.getBytes(), priority);
        }

    }

}
