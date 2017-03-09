package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@DriversLicenseNodeScope
public class DriversLicenseNodeRuleProvider implements RuleProvider<DriversLicenseNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public DriversLicenseNodeRuleProvider() {
    }

    @Override
    public void initializeState(DriversLicenseNode node) {
        parentRuleProvider.initializeState(node);

        node.setPattern("\\d{8,8}");
        node.setPatternMessage("Must be 8 digits");
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
