package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CompanyPrivacyNode;


@CompanyPrivacyNodeScope
public class CompanyPrivacyNodeRuleProvider
    extends ObjectUiNodeRuleProvider<CompanyPrivacyNode> {

    @Inject
    public CompanyPrivacyNodeRuleProvider() {}

    @Override
    public void initializeState(CompanyPrivacyNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
