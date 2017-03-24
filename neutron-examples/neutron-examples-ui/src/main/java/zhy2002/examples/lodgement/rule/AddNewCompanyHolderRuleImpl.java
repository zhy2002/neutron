package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.event.CompanyNodeAddEvent;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.examples.lodgement.gen.node.SelectAccountHolderListNode;
import zhy2002.examples.lodgement.gen.node.SelectAccountHolderNode;
import zhy2002.examples.lodgement.gen.rule.AddNewCompanyHolderRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.NodeAddEventBinding;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.UiNodeConfig;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;


public class AddNewCompanyHolderRuleImpl extends AddNewCompanyHolderRule {

    private ApplicationNode applicationNode;

    @Inject
    public AddNewCompanyHolderRuleImpl(@Owner SelectAccountHolderListNode<?> owner) {
        super(owner);

        applicationNode = (ApplicationNode) owner.getContext().getRootNode();
    }

    @Override
    protected UiNode<?> findHost() {
        return applicationNode.getCompanyListNode();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new NodeAddEventBinding<>(
                        this::importApplicant,
                        CompanyNodeAddEvent.class,
                        applicationNode.getCompanyListNode().getName()
                )
        );
    }

    private void importApplicant(CompanyNodeAddEvent addEvent) {
        final SelectAccountHolderNode ownershipNode = getSelectAccountHolderListNode().createItem();

        class Config extends UiNodeConfig<SelectAccountHolderNode> {
            private Config(SelectAccountHolderNode owner) {
                super(owner);
            }

            @Override
            public void exitLoad() {
                super.exitLoad();
                getOwner().getAccountHolderReferenceNode().setValue(addEvent.getOrigin().getPath());
            }
        }

        new Config(ownershipNode);
    }
}


