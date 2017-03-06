package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;


public class BasePrivacyNodeRuleProvider implements RuleProvider<BasePrivacyNode<?>> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public BasePrivacyNodeRuleProvider() {
    }

    @Override
    public void initializeState(BasePrivacyNode<?> node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
    }

}
