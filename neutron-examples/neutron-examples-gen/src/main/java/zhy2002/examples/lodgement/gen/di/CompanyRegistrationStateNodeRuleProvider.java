package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CompanyRegistrationStateNode;
import zhy2002.examples.lodgement.gen.di.*;

@CompanyRegistrationStateNodeScope
public class CompanyRegistrationStateNodeRuleProvider implements RuleProvider<CompanyRegistrationStateNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyRegistrationStateNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyRegistrationStateNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
