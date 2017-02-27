package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CompanyGeneralNode;


@CompanyGeneralNodeScope
public class CompanyGeneralNodeRuleProvider
    extends ObjectUiNodeRuleProvider<CompanyGeneralNode> {

    @Inject
    public CompanyGeneralNodeRuleProvider() {}

    @Override
    public void initializeState(CompanyGeneralNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
