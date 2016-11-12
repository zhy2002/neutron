package zhy2002.examples.register;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class RegisterNodeContextTest {

    private RegisterNodeContext context;
    private RegisterNode registerNode;

    @Before
    public void setup() {
        context = new RegisterNodeContext();
        registerNode = context.getRootNode();
    }

    @Test
    public void canCreateRegisterNodeContext() {
        //act
        RegisterNode registerNode = context.getRootNode();

        //assert
        assertThat(registerNode, notNullValue());
        assertThat(registerNode.getUsernameNode(), notNullValue());
        assertThat(registerNode.getPasswordNode(), notNullValue());
        assertThat(registerNode.getErrorListNode(), notNullValue());
    }

    @Test
    public void canSetUsernameNode() {
        UsernameNode usernameNode = registerNode.getUsernameNode();
        usernameNode.setValue("abc");

        assertThat(usernameNode.getValue(), equalTo("abc"));
    }

    @Test
    public void canSetPasswordNode() {
        PasswordNode passwordNode = registerNode.getPasswordNode();
        passwordNode.setValue("abc");

        assertThat(passwordNode.getValue(), equalTo("abc"));
    }

    @Test
    public void validateUsernameLength() {
//        UsernameNode usernameNode = registerNode.getUsernameNode();
//        RegisterErrors errors = registerNode.getErrors();
//
//        assertThat(errors.getChildCount(), equalTo(0));
//
//        usernameNode.setValue("abc");
//        assertThat(errors.getChildCount(), equalTo(1));
//        RegisterError error = errors.getChild(0);
//        assertThat(error.getSourceNode(), sameInstance(usernameNode));
//        assertThat(error.getMessage(), equalTo(UsernameLengthRule.ERROR_MESSAGE));
//
//        usernameNode.setValue("abcd");
//        assertThat(errors.getChildCount(), equalTo(0));

    }

    @Test
    public void cannotTypeHashInUsername() {
//        UsernameNode usernameNode = registerNode.getUsernameNode();
//        usernameNode.setValue("test");
//        assertThat(usernameNode.getValue(), equalTo("test"));
//
//        boolean exceptionThrown = false;
//        try {
//            usernameNode.setValue("test#");
//        } catch (RuntimeException ex) {
//            exceptionThrown = true;
//        }
//
//        assertThat(exceptionThrown, equalTo(true));
//        assertThat(usernameNode.getValue(), equalTo("test"));
    }


}