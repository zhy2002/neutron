package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@PersonNodeScope
public class PersonNodeRuleProvider implements RuleProvider<PersonNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public PersonNodeRuleProvider() {
    }

    @Override
    public void initializeState(PersonNode node) {
        parentRuleProvider.initializeState(node);

        node.setSelectedName("personGeneralNode");
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
