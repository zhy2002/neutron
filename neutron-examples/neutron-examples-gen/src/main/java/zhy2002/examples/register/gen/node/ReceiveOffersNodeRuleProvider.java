package zhy2002.examples.register.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.ReceiveOffersNode;
import zhy2002.neutron.rule.*;
import zhy2002.examples.register.gen.di.*;
import zhy2002.examples.register.gen.rule.*;

@ComponentScope
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

        EmailIsRequiredWhenReceiveOffersRule emailIsRequiredWhenReceiveOffersRule = emailIsRequiredWhenReceiveOffersRuleProvider.get();
        createdRules.add(emailIsRequiredWhenReceiveOffersRule);
    }

}
