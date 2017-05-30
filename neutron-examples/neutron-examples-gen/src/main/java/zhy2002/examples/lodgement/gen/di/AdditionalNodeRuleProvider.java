package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.AdditionalNode;
import zhy2002.examples.lodgement.gen.di.*;

@AdditionalNodeScope
public class AdditionalNodeRuleProvider implements RuleProvider<AdditionalNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public AdditionalNodeRuleProvider() {
    }

    @Override
    public void initializeState(AdditionalNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
