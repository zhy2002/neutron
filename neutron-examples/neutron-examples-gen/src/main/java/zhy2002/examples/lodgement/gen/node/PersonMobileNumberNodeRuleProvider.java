package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonMobileNumberNodeScope
public class PersonMobileNumberNodeRuleProvider implements RuleProvider<PersonMobileNumberNode> {

    @Inject
    BaseMobileNumberNodeRuleProvider parentRuleProvider;

    @Inject
    public PersonMobileNumberNodeRuleProvider() {
    }

    @Override
    public void initializeState(PersonMobileNumberNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
    }

}
