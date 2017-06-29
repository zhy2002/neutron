package zhy2002.mortgage.application.shared;

import zhy2002.mortgage.application.gen.node.AccessCompanyNameNode;
import zhy2002.mortgage.application.gen.node.AccessContactTypeNode;
import zhy2002.mortgage.application.gen.node.AccessOtherDescriptionNode;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.RefreshEventBinding;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.config.NeutronConstants;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.util.ValueUtil;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;


public class AccessContactTypeChangeRule extends UiNodeRule<AccessContactTypeNode> {

    @Inject
    protected AccessContactTypeChangeRule(@Owner AccessContactTypeNode owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new RefreshEventBinding(
                        e -> update(),
                        NeutronConstants.NODE_LOADED_REFRESH_REASON
                ),
                new StringStateChangeEventBinding(
                        e -> update()
                )
        );
    }

    private void update() {
        AccessOtherDescriptionNode otherDescriptionNode = getOwner().getParent().getAccessOtherDescriptionNode();
        AccessCompanyNameNode accessCompanyNameNode = getOwner().getParent().getAccessCompanyNameNode();

        if (ValueUtil.isEmpty(getOwner().getValue())) {
            NodeUtil.disableAllSiblings(getOwner(), true, accessCompanyNameNode, otherDescriptionNode);
        } else {
            NodeUtil.disableAllSiblings(getOwner(), false, accessCompanyNameNode, otherDescriptionNode);
        }

        if ("Selling Agent".equals(getOwner().getValue())) {
            accessCompanyNameNode.setDisabled(false);
        } else {
            accessCompanyNameNode.resetValue();
            accessCompanyNameNode.setDisabled(true);
        }

    }
}
