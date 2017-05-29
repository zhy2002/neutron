package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.westpac.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;



public class WestpacEmployedNodeRuleProvider extends EmployedNodeRuleProvider {

    @Inject
    public WestpacEmployedNodeRuleProvider() {
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
