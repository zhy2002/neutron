package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CompanyDescriptionNode;
import zhy2002.examples.lodgement.gen.di.*;

@CompanyDescriptionNodeScope
public class CompanyDescriptionNodeRuleProvider implements RuleProvider<CompanyDescriptionNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyDescriptionNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyDescriptionNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}