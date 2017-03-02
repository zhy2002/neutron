package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.UsedAsSecurityFlagNode;


@UsedAsSecurityFlagNodeScope
public class UsedAsSecurityFlagNodeRuleProvider
    extends BooleanUiNodeRuleProvider<UsedAsSecurityFlagNode> {

    @Inject
    public UsedAsSecurityFlagNodeRuleProvider() {}

    @Override
    public void initializeState(UsedAsSecurityFlagNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
