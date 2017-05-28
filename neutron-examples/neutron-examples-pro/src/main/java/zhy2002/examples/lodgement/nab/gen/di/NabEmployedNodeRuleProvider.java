package zhy2002.examples.lodgement.nab.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.nab.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;



public class NabEmployedNodeRuleProvider extends EmployedNodeRuleProvider {

    @Inject
    public NabEmployedNodeRuleProvider() {
    }

    @Override
    public void initializeState(EmployedNode node) {
        super.initializeState(node);

    }

    @Inject
    Provider<DoNotLoadEndedDateForCurrentRecordRule> doNotLoadEndedDateForCurrentRecordRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        DoNotLoadEndedDateForCurrentRecordRule doNotLoadEndedDateForCurrentRecordRule = doNotLoadEndedDateForCurrentRecordRuleProvider.get();
        createdRules.add(doNotLoadEndedDateForCurrentRecordRule);
    }

}
