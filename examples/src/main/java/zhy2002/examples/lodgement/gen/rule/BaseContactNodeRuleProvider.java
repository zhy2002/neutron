package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.BaseContactNode;



public abstract class BaseContactNodeRuleProvider<N extends BaseContactNode<?>>
    extends ObjectUiNodeRuleProvider <N> {


    @Inject
    Provider<HomeOrWorkPhoneRequiredRule> homeOrWorkPhoneRequiredRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(homeOrWorkPhoneRequiredRuleProvider.get());
    }

}