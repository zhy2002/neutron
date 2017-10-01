package zhy2002.neutron.core.rule;

import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.core.node.BooleanUiNode;
import zhy2002.neutron.core.util.CollectionUtil;

import javax.inject.Inject;
import java.util.Collection;


/**
 * Enable a sibling node if owner has a certain value.
 * Optional rule for BooleanUiNode.
 */
public class BooleanEnableSiblingRule extends AbstractEnableSiblingRule<BooleanUiNode<?>, Boolean> {

    @Inject
    protected BooleanEnableSiblingRule(@Owner BooleanUiNode<?> owner) {
        super(owner, Boolean.TRUE);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new BooleanStateChangeEventBinding(this::updateSibling)
        );
    }
}
