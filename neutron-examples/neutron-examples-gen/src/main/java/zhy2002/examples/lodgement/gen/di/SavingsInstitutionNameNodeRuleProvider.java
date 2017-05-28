package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.SavingsInstitutionNameNode;
import zhy2002.examples.lodgement.gen.di.*;

@SavingsInstitutionNameNodeScope
public class SavingsInstitutionNameNodeRuleProvider implements RuleProvider<SavingsInstitutionNameNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public SavingsInstitutionNameNodeRuleProvider() {
    }

    @Override
    public void initializeState(SavingsInstitutionNameNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
