package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@ErrorListNodeScope
public class ErrorListNodeRuleProvider implements RuleProvider<ErrorListNode> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ErrorListNodeRuleProvider() {
    }

    @Override
    public void initializeState(ErrorListNode node) {
        parentRuleProvider.initializeState(node);

        node.setChangeTrackingMode(ApplicationNodeConstants.FOCUS, ChangeTrackingModeEnum.Always);
    }

    @Inject
    Provider<ChangeFocusErrorRule> changeFocusErrorRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
            createdRules.add(changeFocusErrorRuleProvider.get());
    }

}
