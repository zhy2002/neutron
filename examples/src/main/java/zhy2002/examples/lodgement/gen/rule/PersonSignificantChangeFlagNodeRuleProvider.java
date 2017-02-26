package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonSignificantChangeFlagNode;


@PersonSignificantChangeFlagNodeScope
public class PersonSignificantChangeFlagNodeRuleProvider
    extends YesNoOptionNodeRuleProvider<PersonSignificantChangeFlagNode> {

    @Inject
    public PersonSignificantChangeFlagNodeRuleProvider() {}

    @Override
    public void initializeState(PersonSignificantChangeFlagNode node) {
    }


    @Inject
    Provider<PersonSignificantChangeRule> personSignificantChangeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(personSignificantChangeRuleProvider.get());
    }

}
