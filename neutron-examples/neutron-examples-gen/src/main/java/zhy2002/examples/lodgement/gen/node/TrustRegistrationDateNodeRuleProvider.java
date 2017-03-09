package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

@TrustRegistrationDateNodeScope
public class TrustRegistrationDateNodeRuleProvider implements RuleProvider<TrustRegistrationDateNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public TrustRegistrationDateNodeRuleProvider() {
    }

    @Override
    public void initializeState(TrustRegistrationDateNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}