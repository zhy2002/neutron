package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.DriversLicenseNode;


@DriversLicenseNodeScope
public class DriversLicenseNodeRuleProvider
    extends StringUiNodeRuleProvider<DriversLicenseNode> {

    @Inject
    public DriversLicenseNodeRuleProvider() {}

    @Override
    public void initializeState(DriversLicenseNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
