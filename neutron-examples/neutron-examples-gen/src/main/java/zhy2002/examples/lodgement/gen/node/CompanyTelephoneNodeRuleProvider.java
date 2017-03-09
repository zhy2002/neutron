package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CompanyTelephoneNodeScope
public class CompanyTelephoneNodeRuleProvider implements RuleProvider<CompanyTelephoneNode> {

    @Inject
    TelephoneNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyTelephoneNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyTelephoneNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}