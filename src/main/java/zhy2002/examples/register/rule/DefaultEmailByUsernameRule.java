package zhy2002.examples.register.rule;

import zhy2002.examples.register.gen.EmailNode;
import zhy2002.examples.register.gen.UsernameNode;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.event.StringStateChangeEventBinding;

import java.util.Collection;
import java.util.Collections;

/**
 * Email is always username + '@gmail.com'
 */
public class DefaultEmailByUsernameRule extends UiNodeRule<UsernameNode> {

    public DefaultEmailByUsernameRule(UsernameNode owner) {
        super(owner);
    }

    private EmailNode getEmailNode() {
        return getOwner().getParent().getEmailNode();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new StringStateChangeEventBinding(
                        e -> setDefaultEmail()
                )
        );
    }

    private void setDefaultEmail() {
        String value = getOwner().getValue();
        String email = value == null ? "" : value + "@gmail.com";
        getEmailNode().setValue(email);
    }
}
