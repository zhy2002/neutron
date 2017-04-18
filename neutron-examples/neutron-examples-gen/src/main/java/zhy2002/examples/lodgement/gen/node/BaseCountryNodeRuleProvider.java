package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


public class BaseCountryNodeRuleProvider implements RuleProvider<BaseCountryNode<?>> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public BaseCountryNodeRuleProvider() {
    }

    @Override
    public void initializeState(BaseCountryNode<?> node) {
        parentRuleProvider.initializeState(node);

        node.setOptions(ApplicationNodeConstants.COUNTRY_TYPE);
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
