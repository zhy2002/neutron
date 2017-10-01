package zhy2002.neutron.examples.register.rule;

import zhy2002.neutron.examples.register.gen.node.*;
import zhy2002.neutron.examples.register.gen.rule.DefaultEmailByUsernameRule;
import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.StringStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

/**
 * Email is always username + '@gmail.com'
 */
public class DefaultEmailByUsernameRuleImpl extends DefaultEmailByUsernameRule {

    @Inject
    public DefaultEmailByUsernameRuleImpl(@Owner UsernameNode owner) {
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
