package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CompanyRegistrationStateNode;


@CompanyRegistrationStateNodeScope
public class CompanyRegistrationStateNodeRuleProvider
    extends StringUiNodeRuleProvider<CompanyRegistrationStateNode> {

    @Inject
    public CompanyRegistrationStateNodeRuleProvider() {}

    @Override
    public void initializeState(CompanyRegistrationStateNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
