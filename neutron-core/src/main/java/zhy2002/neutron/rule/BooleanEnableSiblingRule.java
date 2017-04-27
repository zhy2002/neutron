package zhy2002.neutron.rule;

import zhy2002.neutron.EventBinding;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.node.BooleanUiNode;
import zhy2002.neutron.util.CollectionUtil;

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
