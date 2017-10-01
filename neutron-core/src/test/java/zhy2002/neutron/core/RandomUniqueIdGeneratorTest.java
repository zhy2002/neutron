package zhy2002.neutron.core;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class RandomUniqueIdGeneratorTest {

    private RandomUniqueIdGenerator generator;

    @Before
    public void setup() {
        generator = new RandomUniqueIdGenerator(1);
    }

    @Test
    public void idsShouldBeDifferent() {

        for (int i = 0; i < 10; i++) {
            String id1 = generator.next();
            String id2 = generator.next();
            assertThat(id1, not(equalTo(id2)));
        }
    }

    @Test
    public void idShouldHave12Chars() {
        for (int i = 0; i < 10; i++) {
            String id1 = generator.next();
            System.out.println(id1);
            assertThat(id1.length(), equalTo(12));
        }
    }
}
