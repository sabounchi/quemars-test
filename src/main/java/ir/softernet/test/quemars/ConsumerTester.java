package ir.softernet.test.quemars;

import ir.softernet.lib.quemars.QuemarsConfig;
import ir.softernet.lib.quemars.QuemarsConsumer;

/**
 * Created by saman on 4/19/16.
 */
public class ConsumerTester {

    public ConsumerTester() {
    }

    public static void main(String[] args) {
        final QuemarsConsumer consumer = new QuemarsConsumer(new QuemarsConfig(7, "test"), 2) {
            @Override
            public void consume(byte[] bytes) {
                System.out.println(new String(bytes));
            }
        };
    }
}
