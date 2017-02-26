package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.ReceiveOffersNode;


@ReceiveOffersNodeScope
public class ReceiveOffersNodeRuleProvider
    extends BooleanUiNodeRuleProvider<ReceiveOffersNode> {

    @Inject
    public ReceiveOffersNodeRuleProvider() {}

    @Override
    public void initializeState(ReceiveOffersNode node) {
    }


    @Inject
    Provider<EmailIsRequiredWhenReceiveOffersRule> emailIsRequiredWhenReceiveOffersRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(emailIsRequiredWhenReceiveOffersRuleProvider.get());
    }

}
