package zhy2002.examples.lodgement.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.DriversLicenseNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class DriversLicenseNodeRuleProvider implements RuleProvider<DriversLicenseNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public DriversLicenseNodeRuleProvider() {
    }

    @Override
    public void initializeState(DriversLicenseNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}