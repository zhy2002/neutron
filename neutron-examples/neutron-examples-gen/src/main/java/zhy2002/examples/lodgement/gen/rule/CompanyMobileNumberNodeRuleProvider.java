package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CompanyMobileNumberNode;


@CompanyMobileNumberNodeScope
public class CompanyMobileNumberNodeRuleProvider
    extends BaseMobileNumberNodeRuleProvider<CompanyMobileNumberNode> {

    @Inject
    public CompanyMobileNumberNodeRuleProvider() {}

    @Override
    public void initializeState(CompanyMobileNumberNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
