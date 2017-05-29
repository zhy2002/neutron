package zhy2002.examples.lodgement.bankc.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@DriversLicenseNodeScope
public class BankCDriversLicenseNodeRuleProvider extends DriversLicenseNodeRuleProvider {

    @Inject
    public BankCDriversLicenseNodeRuleProvider() {
    }

    @Override
    public void initializeState(DriversLicenseNode node) {
        super.initializeState(node);

        node.setPattern("\\d{8,8}");
        node.setPatternMessage("Must be 8 digits");
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
