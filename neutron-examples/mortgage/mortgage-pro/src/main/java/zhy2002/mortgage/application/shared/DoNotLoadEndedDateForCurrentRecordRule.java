package zhy2002.mortgage.application.shared;


import zhy2002.mortgage.application.gen.node.EmployedNode;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

public class DoNotLoadEndedDateForCurrentRecordRule extends UiNodeRule<EmployedNode> {

    @Inject
    public DoNotLoadEndedDateForCurrentRecordRule(@Owner EmployedNode owner) {
        super(owner);
    }

    protected EmployedNode getEmployedNode() {
        return getOwner();
    }

    @Override
    public void addToOwner() {
        super.addToOwner();

        if (getOwner().getParent().getCurrentRecord()) {
            getOwner().getEmploymentEndedNode().setLoadWithParent(false);
        }
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.emptyList();
    }
}
