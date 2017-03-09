package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.rule.*;

@ReceiveOffersNodeScope
public class ReceiveOffersNodeRuleProvider implements RuleProvider<ReceiveOffersNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ReceiveOffersNodeRuleProvider() {
    }

    @Override
    public void initializeState(ReceiveOffersNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<EmailIsRequiredWhenReceiveOffersRule> emailIsRequiredWhenReceiveOffersRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

            createdRules.add(emailIsRequiredWhenReceiveOffersRuleProvider.get());
    }

}
