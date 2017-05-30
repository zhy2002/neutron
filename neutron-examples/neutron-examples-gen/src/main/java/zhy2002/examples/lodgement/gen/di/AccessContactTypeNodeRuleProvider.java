package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.AccessContactTypeNode;
import zhy2002.examples.lodgement.gen.di.*;

@AccessContactTypeNodeScope
public class AccessContactTypeNodeRuleProvider implements RuleProvider<AccessContactTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public AccessContactTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(AccessContactTypeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
