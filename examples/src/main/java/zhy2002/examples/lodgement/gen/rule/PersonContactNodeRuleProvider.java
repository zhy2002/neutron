package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonContactNode;


@PersonContactNodeScope
public class PersonContactNodeRuleProvider
    extends BaseContactNodeRuleProvider<PersonContactNode> {

    @Inject
    public PersonContactNodeRuleProvider() {}

    @Override
    public void initializeState(PersonContactNode node) {
    }


    @Inject
    Provider<HomeOrWorkPhoneRequiredRule> homeOrWorkPhoneRequiredRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(homeOrWorkPhoneRequiredRuleProvider.get());
    }

}
