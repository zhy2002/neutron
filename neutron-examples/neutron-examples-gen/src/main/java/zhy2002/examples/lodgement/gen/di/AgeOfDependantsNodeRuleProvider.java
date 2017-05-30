package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.AgeOfDependantsNode;
import zhy2002.examples.lodgement.gen.di.*;

@AgeOfDependantsNodeScope
public class AgeOfDependantsNodeRuleProvider implements RuleProvider<AgeOfDependantsNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public AgeOfDependantsNodeRuleProvider() {
    }

    @Override
    public void initializeState(AgeOfDependantsNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
