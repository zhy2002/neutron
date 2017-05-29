package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CountryNode;
import zhy2002.examples.lodgement.gen.di.*;

@CountryNodeScope
public class CountryNodeRuleProvider implements RuleProvider<CountryNode> {

    @Inject
    BaseCountryNodeRuleProvider parentRuleProvider;

    @Inject
    public CountryNodeRuleProvider() {
    }

    @Override
    public void initializeState(CountryNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}