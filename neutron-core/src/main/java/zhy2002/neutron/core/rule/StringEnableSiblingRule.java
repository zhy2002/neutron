package zhy2002.neutron.core.rule;

import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.StringStateChangeEventBinding;
import zhy2002.neutron.core.node.StringUiNode;
import zhy2002.neutron.core.util.CollectionUtil;

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

