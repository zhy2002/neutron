package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

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

        node.setOptions(ApplicationNodeConstants.AUSTRALIAN_STATES.toArray());
        node.setRequired(true);
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
