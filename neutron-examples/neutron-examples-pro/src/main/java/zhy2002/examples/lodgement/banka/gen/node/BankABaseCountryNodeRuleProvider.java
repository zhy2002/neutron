package zhy2002.examples.lodgement.banka.gen.node;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;



public class BankABaseCountryNodeRuleProvider extends BaseCountryNodeRuleProvider {

    @Inject
    public BankABaseCountryNodeRuleProvider() {
    }

    @Override
    public void initializeState(BaseCountryNode<?> node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.COUNTRY_TYPE);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
