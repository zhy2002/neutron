package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;

@PersonEmailNodeScope
public class PersonEmailNodeRuleProvider implements RuleProvider<PersonEmailNode> {

    @Inject
    EmailNodeRuleProvider parentRuleProvider;

    @Inject
    public PersonEmailNodeRuleProvider() {
    }

    @Override
    public void initializeState(PersonEmailNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
