package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CompanyContactFirstNameNode;
import zhy2002.examples.lodgement.gen.di.*;

@CompanyContactFirstNameNodeScope
public class CompanyContactFirstNameNodeRuleProvider implements RuleProvider<CompanyContactFirstNameNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyContactFirstNameNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyContactFirstNameNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
