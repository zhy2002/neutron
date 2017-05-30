package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.OtherAssetNode;
import zhy2002.examples.lodgement.gen.di.*;

@OtherAssetNodeScope
public class OtherAssetNodeRuleProvider implements RuleProvider<OtherAssetNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public OtherAssetNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherAssetNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
