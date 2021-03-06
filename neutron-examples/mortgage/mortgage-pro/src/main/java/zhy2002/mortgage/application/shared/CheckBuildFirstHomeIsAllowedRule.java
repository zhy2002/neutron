package zhy2002.mortgage.application.shared;

import zhy2002.mortgage.application.gen.node.*;
import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.UiNode;
import zhy2002.neutron.core.ValidationRule;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.core.event.StringStateChangeEventBinding;
import zhy2002.neutron.core.util.CollectionUtil;

import javax.inject.Inject;
import java.util.Collection;

/**
 * Check if the build first home lending purpose can be selected.
 */
public class CheckBuildFirstHomeIsAllowedRule extends ValidationRule<ProductLendingPurposeNode> {

    @Inject
    ApplicationNode applicationNode;

    @Inject
    protected CheckBuildFirstHomeIsAllowedRule(@Owner ProductLendingPurposeNode owner) {
        super(owner);
    }

    @Override
    protected UiNode<?> findHost() {
        return applicationNode;
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new StringStateChangeEventBinding(
                        e -> validate()
                ),
                new BooleanStateChangeEventBinding(
                        e -> e.getOrigin() instanceof FirstHomeBuyerFlagNode,
                        e -> validate()
                )
        );
    }

    @Override
    protected String getErrorMessage() {
        PersonListNode personListNode = applicationNode.getPersonListNode();
        if (!"BUILD_FIRST".equals(getOwner().getValue()))
            return null;

        for (int i = 0; i < personListNode.getItemCount(); i++) {
            PersonNode personNode = personListNode.getItem(i);
            if (Boolean.FALSE.equals(
                    personNode.getPersonGeneralNode().getFirstHomeBuyerFlagNode().getValue()
            )) {
                return "All person applicants must be first home buyer.";
            }
        }
        return null;
    }
}
