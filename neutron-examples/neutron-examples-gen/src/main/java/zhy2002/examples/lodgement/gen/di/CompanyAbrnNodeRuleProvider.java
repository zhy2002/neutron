package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CompanyAbrnNode;
import zhy2002.examples.lodgement.gen.di.*;

@CompanyAbrnNodeScope
public class CompanyAbrnNodeRuleProvider implements RuleProvider<CompanyAbrnNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyAbrnNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyAbrnNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}