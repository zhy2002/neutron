package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CompanyRegisteredNameNode;
import zhy2002.examples.lodgement.gen.di.*;

@CompanyRegisteredNameNodeScope
public class CompanyRegisteredNameNodeRuleProvider implements RuleProvider<CompanyRegisteredNameNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyRegisteredNameNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyRegisteredNameNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
