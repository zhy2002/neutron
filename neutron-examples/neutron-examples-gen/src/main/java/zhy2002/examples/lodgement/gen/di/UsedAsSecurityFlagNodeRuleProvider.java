package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.UsedAsSecurityFlagNode;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@UsedAsSecurityFlagNodeScope
public class UsedAsSecurityFlagNodeRuleProvider implements RuleProvider<UsedAsSecurityFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public UsedAsSecurityFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(UsedAsSecurityFlagNode node) {
        parentRuleProvider.initializeState(node);

        node.setValue(null);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
