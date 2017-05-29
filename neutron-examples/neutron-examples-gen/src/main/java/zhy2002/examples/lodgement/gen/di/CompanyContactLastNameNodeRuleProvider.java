package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CompanyContactLastNameNode;
import zhy2002.examples.lodgement.gen.di.*;

@CompanyContactLastNameNodeScope
public class CompanyContactLastNameNodeRuleProvider implements RuleProvider<CompanyContactLastNameNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyContactLastNameNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyContactLastNameNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}