package zhy2002.neutron.rule;

import zhy2002.neutron.EventBinding;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.node.StringUiNode;
import zhy2002.neutron.util.CollectionUtil;

import javax.inject.Inject;
import java.util.Collection;

/**
 * Enable a sibling node if owner has a certain value.
 * Optional rule for BooleanUiNode.
 */
public class StringEnableSiblingRule extends AbstractEnableSiblingRule<StringUiNode<?>, String> {

    @Inject
    protected StringEnableSiblingRule(@Owner StringUiNode<?> owner) {
        super(owner, "Yes");
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new StringStateChangeEventBinding(this::updateSibling)
        );
    }

}

