package zhy2002.mortgage.application.shared;

import zhy2002.mortgage.application.gen.node.CompanyNode;
import zhy2002.mortgage.application.gen.node.CompanyRegisteredNameNode;
import zhy2002.neutron.core.UiNodeEvent;
import zhy2002.neutron.core.rule.AbstractUpdateItemNodeLabelRule;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.util.ValueUtil;

import javax.inject.Inject;


public class UpdateCompanyNodeLabelRule extends AbstractUpdateItemNodeLabelRule<CompanyNode> {

    @Inject
    public UpdateCompanyNodeLabelRule(@Owner CompanyNode owner) {
        super(owner);
    }

    private CompanyRegisteredNameNode getCompanyRegisteredNameNode() {
        return getOwner().getCompanyGeneralNode().getCompanyRegisteredNameNode();
    }

    @Override
    protected boolean filter(UiNodeEvent event) {
        CompanyRegisteredNameNode nameNode = getCompanyRegisteredNameNode();
        return event.getOrigin() == nameNode;
    }

    @Override
    protected void updateLabel(UiNodeEvent event) {
        String name = getCompanyRegisteredNameNode().getValue();

        if (!ValueUtil.isEmpty(name)) {
            getOwner().setNodeLabel(name);
        } else {
            getOwner().setNodeLabel("[Company " + (Integer.parseInt(getOwner().getName()) + 1) + "]");
        }
    }
}
