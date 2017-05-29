package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.westpac.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@UsedAsSecurityFlagNodeScope
public class WestpacUsedAsSecurityFlagNodeRuleProvider extends UsedAsSecurityFlagNodeRuleProvider {

    @Inject
    public WestpacUsedAsSecurityFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(UsedAsSecurityFlagNode node) {
        super.initializeState(node);

        node.setValue(null);
        node.setRequired(true);
    }

    @Inject
    Provider<UsedAsSecurityFlagChangeRule> usedAsSecurityFlagChangeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UsedAsSecurityFlagChangeRule usedAsSecurityFlagChangeRule = usedAsSecurityFlagChangeRuleProvider.get();
        createdRules.add(usedAsSecurityFlagChangeRule);
    }

}
