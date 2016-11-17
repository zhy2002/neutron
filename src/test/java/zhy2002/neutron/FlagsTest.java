package zhy2002.neutron;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


class TestFlags extends Flags {

    public boolean getFlag(int index) {
        return super.getFlag(index);
    }

    public void setFlag(int index, boolean value) {
        super.setFlag(index, value);
    }
}

public class FlagsTest {

    @Test
    public void canGetAndSetFlags() {
        for (int i = 0; i < 32; i++) {
            testBit(i);
        }
    }

    private void testBit(int index) {
        try {
            TestFlags testFlags = new TestFlags();
            assertThat(testFlags.getFlag(index), equalTo(false));

            testFlags.setFlag(index, true);
            assertThat(testFlags.getFlag(index), equalTo(true));

            testFlags.setFlag(index, false);
            assertThat(testFlags.getFlag(index), equalTo(false));
        } catch (Throwable t) {
            System.out.println(index);
        }
    }

}
