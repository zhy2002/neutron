package zhy2002.examples.register;

import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.CountingChangeListener;
import zhy2002.examples.register.di.RegisterNodeFactory;
import zhy2002.examples.register.gen.node.EmailNode;
import zhy2002.examples.register.gen.node.ErrorNode;
import zhy2002.examples.register.gen.node.RegisterNode;
import zhy2002.examples.register.gen.node.UsernameNode;
import zhy2002.neutron.CycleModeEnum;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.UiNodeRule;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class DebouncingModeTest {

    private RegisterNode registerNode;

    @Before
    public void init() {
        registerNode = RegisterNodeFactory.create();
        registerNode.getContext().setCycleMode(CycleModeEnum.Debouncing);
    }

    @Test
    public void canNotifyTemporaryChanges() {
        CountingChangeListener countingChangeListener = new CountingChangeListener();
        EmailNode emailNode = registerNode.getEmailNode();
        emailNode.addChangeListener(countingChangeListener);
        emailNode.setValue("a");
        assertThat(countingChangeListener.getCount(), equalTo(1));
        assertThat(emailNode.getValue(), equalTo("a"));
        assertThat(nodeHasError(emailNode), equalTo(false));

        emailNode.setValue("ab");
        assertThat(countingChangeListener.getCount(), equalTo(2));
        assertThat(emailNode.getValue(), equalTo("ab"));
        assertThat(nodeHasError(emailNode), equalTo(false));
        assertThat(registerNode.getContext().isInSession(), equalTo(true));

        registerNode.getContext().flush();
        assertThat(emailNode.getValue(), equalTo("ab"));
        assertThat(nodeHasError(emailNode), equalTo(true));
        assertThat(registerNode.getContext().isInSession(), equalTo(false));
    }

    @Test
    public void flushDoNotCommitIfSessionIsBegunManually() {
        registerNode.getContext().beginSession();
        registerNode.getEmailNode().setValue("test");
        registerNode.getContext().flush();
        assertThat(registerNode.getContext().isInSession(), equalTo(true));
        assertThat(registerNode.getEmailNode().getValue(), equalTo("test"));

        registerNode.getContext().rollbackSession();
        assertThat(registerNode.getEmailNode().getValue(), equalTo(""));
    }

    @Test
    public void debouncingModeOnlyTriggersChangeForLastSetValue() {
        CountingChangeListener countingChangeListener = new CountingChangeListener();
        registerNode.getErrorListNode().addChangeListener(countingChangeListener);
        registerNode.getContext().beginSession();
        registerNode.getEmailNode().setValue("a");
        registerNode.getEmailNode().setValue("b@test.com");
        registerNode.getEmailNode().setValue("c");
        registerNode.getContext().commitSession();
        assertThat(countingChangeListener.getCount(), equalTo(1));
    }

    @Test
    public void autoModeTriggersChangeForEachSetValue() {
        CountingChangeListener countingChangeListener = new CountingChangeListener();
        registerNode.getErrorListNode().addChangeListener(countingChangeListener);
        registerNode.getContext().setCycleMode(CycleModeEnum.Auto);
        registerNode.getContext().beginSession();
        registerNode.getEmailNode().setValue("a");
        registerNode.getEmailNode().setValue("b@test.com");
        registerNode.getEmailNode().setValue("c");
        registerNode.getContext().commitSession();
        assertThat(countingChangeListener.getCount(), equalTo(3));
    }

    @Test
    public void undoWillClearTempValue() {
        registerNode.getContext().beginSession();
        EmailNode emailNode = registerNode.getEmailNode();
        emailNode.setValue("test@test.com");
        registerNode.getContext().flush();
        emailNode.setValue("test2@test.com");
        registerNode.getContext().flush();
        emailNode.setValue("test3@test.com");
        assertThat(registerNode.getContext().undo(), equalTo(true));
        assertThat(emailNode.getValue(), equalTo("test@test.com"));
        registerNode.getContext().commitSession();
    }

    @Test
    public void rollbackWillClearTempValue() {
        registerNode.getContext().beginSession();
        UsernameNode usernameNode = registerNode.getUsernameNode();
        usernameNode.setValue("test1");
        EmailNode emailNode = registerNode.getEmailNode();
        assertThat(emailNode.getValue(), equalTo(""));
        emailNode.setValue("test2@abc.com");
        registerNode.getContext().rollbackSession();
        assertThat(emailNode.getValue(), equalTo(""));
        assertThat(usernameNode.getValue(), equalTo(""));
    }

    private boolean nodeHasError(UiNode<?> node) {
        return nodeHasError(node, null);
    }

    private boolean nodeHasError(UiNode<?> node, Class<? extends UiNodeRule<?>> ruleClass) {
        for (int i = 0; i < registerNode.getErrorListNode().getItemCount(); i++) {
            ErrorNode errorNode = registerNode.getErrorListNode().getItem(i);
            if (errorNode.getSource() == node && (ruleClass == null || ruleClass.isAssignableFrom(errorNode.getRule().getClass())))
                return true;
        }

        return false;
    }


}
