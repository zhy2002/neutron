package zhy2002.neutron;

import org.junit.Test;
import zhy2002.neutron.util.Flags;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class FlagsTest {

    @Test
    public void canGetAndSetFlags() {
        for (int i = 0; i < 32; i++) {
            testBit(i);
        }
    }

    private void testBit(int index) {
        try {
            Flags testFlags = new Flags();
            assertThat(testFlags.getFlag(index), equalTo(false));

            testFlags.setFlag(index, true);
            assertThat(testFlags.getFlag(index), equalTo(true));

            testFlags.setFlag(index, false);
            assertThat(testFlags.getFlag(index), equalTo(false));
        } catch (Throwable t) {
            throw new RuntimeException("Failed at index " + index, t);
        }
    }

}
