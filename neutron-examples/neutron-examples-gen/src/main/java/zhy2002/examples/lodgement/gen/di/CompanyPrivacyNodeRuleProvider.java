package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CompanyPrivacyNode;
import zhy2002.examples.lodgement.gen.di.*;

@CompanyPrivacyNodeScope
public class CompanyPrivacyNodeRuleProvider implements RuleProvider<CompanyPrivacyNode> {

    @Inject
    BasePrivacyNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyPrivacyNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyPrivacyNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
