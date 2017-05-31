package zhy2002.examples.lodgement.bankc.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ComponentScope
public class BankCOwnershipPercentageNodeRuleProvider extends OwnershipPercentageNodeRuleProvider {

    @Inject
    public BankCOwnershipPercentageNodeRuleProvider() {
    }

    @Override
    public void initializeState(OwnershipPercentageNode node) {
        super.initializeState(node);

        node.setValue(new BigDecimal("0"));
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
