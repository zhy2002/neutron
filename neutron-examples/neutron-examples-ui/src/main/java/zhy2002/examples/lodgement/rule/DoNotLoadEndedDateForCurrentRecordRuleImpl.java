package zhy2002.examples.lodgement.rule;


import zhy2002.examples.lodgement.gen.node.EmployedNode;
import zhy2002.examples.lodgement.gen.rule.DoNotLoadEndedDateForCurrentRecordRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

public class DoNotLoadEndedDateForCurrentRecordRuleImpl extends DoNotLoadEndedDateForCurrentRecordRule {

    @Inject
    public DoNotLoadEndedDateForCurrentRecordRuleImpl(@Owner EmployedNode owner) {
        super(owner);
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
