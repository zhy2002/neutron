package zhy2002.neutron.anz.loanapplication;

import zhy2002.neutron.uinode.RootUiNode;
import zhy2002.neutron.uinode.factoryregistry.UiNodeFactory;

/**
 * Created by john.zhang on 1/11/2016.
 */
public class LoanApplicationNodeFactory extends UiNodeFactory<LoanApplicationNode, RootUiNode> {
    @Override
    public LoanApplicationNode create(RootUiNode parent) {
        return new LoanApplicationNode(parent);
    }
}
