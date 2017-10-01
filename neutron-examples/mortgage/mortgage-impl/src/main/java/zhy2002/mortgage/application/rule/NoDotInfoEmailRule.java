package zhy2002.mortgage.application.rule;

import zhy2002.mortgage.application.gen.node.PersonEmailNode;
import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.ValidationRule;
import zhy2002.neutron.core.event.StringStateChangeEventBinding;
import zhy2002.neutron.core.util.CollectionUtil;

import java.util.Collection;

public class NoDotInfoEmailRule extends ValidationRule<PersonEmailNode> {

    public NoDotInfoEmailRule(PersonEmailNode owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new StringStateChangeEventBinding(
                        e -> validate()
                )
        );
    }

    @Override
    protected String getErrorMessage() {
        if (getOwner().getValue() != null && getOwner().getValue().endsWith(".info"))
            return "Cannot end with .info";

        return null;
    }
}
