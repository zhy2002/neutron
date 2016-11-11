package zhy2002.neutron.examples.register;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class PasswordNodeTest {

    private RootNode root;

    @Before
    public void setup() {
        root = new RootNodeContextFactory().create().getRoot();
    }

    @Test
    public void canCreateInstance() {
        assertThat(root, notNullValue());
    }

    @Test
    public void canSetAndRetrieveValue() {
        String password = "This is a test";
        root.getPasswordNode().setValue(password);
        assertThat(root.getPasswordNode().getValue(), equalTo(password));
    }

    @Test
    public void setValueShouldAutomaticallyCommitSession() {
        root.getPasswordNode().setValue("Test1");
        assertThat(root.getContext().isDirty(), equalTo(false));
    }


}