package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CompanyTelephoneNode;


@CompanyTelephoneNodeScope
public class CompanyTelephoneNodeRuleProvider
    extends TelephoneNodeRuleProvider<CompanyTelephoneNode> {

    @Inject
    public CompanyTelephoneNodeRuleProvider() {}

    @Override
    public void initializeState(CompanyTelephoneNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
