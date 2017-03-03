package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.event.CompanyNodeAddEvent;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.examples.lodgement.gen.node.OwnershipListNode;
import zhy2002.examples.lodgement.gen.node.OwnershipNode;
import zhy2002.examples.lodgement.gen.rule.AddNewCompanyApplicantRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.NodeAddEventBinding;
import zhy2002.neutron.NopUiNodeStatusListener;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;


public class AddNewCompanyApplicantRuleImpl extends AddNewCompanyApplicantRule {

    private ApplicationNode applicationNode;

    @Inject
    public AddNewCompanyApplicantRuleImpl(@Owner OwnershipListNode<?> owner) {
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
        final OwnershipNode ownershipNode = getOwnershipListNode().createItem();
        ownershipNode.setStatusListener(new NopUiNodeStatusListener() {
            @Override
            public void postLoad() {
                super.postLoad();
                ownershipNode.getApplicantReferenceNode().setValue(addEvent.getOrigin().getPath());
            }
        });
    }
}
