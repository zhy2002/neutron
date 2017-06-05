package zhy2002.examples.app.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.app.gen.node.SiteLogoNode;
import zhy2002.examples.app.gen.di.*;
import zhy2002.examples.app.data.*;
import java.math.*;

@ComponentScope
public class SiteLogoNodeRuleProvider implements RuleProvider<SiteLogoNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public SiteLogoNodeRuleProvider() {
    }

    @Override
    public void initializeState(SiteLogoNode node) {
        parentRuleProvider.initializeState(node);

        node.setValue("img/site_logo.png");
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
