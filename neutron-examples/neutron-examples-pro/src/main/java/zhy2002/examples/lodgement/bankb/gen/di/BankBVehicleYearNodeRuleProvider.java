package zhy2002.examples.lodgement.bankb.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@VehicleYearNodeScope
public class BankBVehicleYearNodeRuleProvider extends VehicleYearNodeRuleProvider {

    @Inject
    public BankBVehicleYearNodeRuleProvider() {
    }

    @Override
    public void initializeState(VehicleYearNode node) {
        super.initializeState(node);

        node.setRequired(true);
        node.setOptions(ApplicationNodeConstants.getYearType());
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
