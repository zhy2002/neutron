package zhy2002.examples.lodgement.bankc.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;



public class BankCBasePercentageNodeRuleProvider extends BasePercentageNodeRuleProvider {

    @Inject
    public BankCBasePercentageNodeRuleProvider() {
    }

    @Override
    public void initializeState(BasePercentageNode<?> node) {
        super.initializeState(node);

        node.setMinValue(new BigDecimal("0"));
        node.setMaxValue(new BigDecimal("100"));
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
