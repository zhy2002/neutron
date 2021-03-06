package zhy2002.mortgage.login.rule;

import zhy2002.mortgage.login.gen.node.LoginNode;
import zhy2002.mortgage.login.gen.node.PasswordNode;
import zhy2002.mortgage.login.gen.node.UsernameNode;
import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.PredefinedPhases;
import zhy2002.neutron.core.UiNodeRule;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.StringStateChangeEventBinding;
import zhy2002.neutron.core.event.ValidationErrorListStateChangeEvent;
import zhy2002.neutron.core.event.ValidationErrorListStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;

/**
 * Set state to error when there is validation error.
 */
public class UpdateLoginStateRule extends UiNodeRule<LoginNode> {

    @Inject
    protected UpdateLoginStateRule(@Owner LoginNode owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new ValidationErrorListStateChangeEventBinding(
                        this::update
                ),
                new StringStateChangeEventBinding(
                        e -> e.getOrigin() instanceof UsernameNode || e.getOrigin() instanceof PasswordNode,
                        e -> getOwner().setLoginState(""),
                        null,
                        PredefinedPhases.Pre
                )
        );
    }

    private void update(ValidationErrorListStateChangeEvent event) {
        getOwner().setLoginState(event.getNewValue().size() == 0 ? "" : "error");
    }
}
