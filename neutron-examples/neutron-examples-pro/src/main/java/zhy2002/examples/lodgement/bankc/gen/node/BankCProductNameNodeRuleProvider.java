package zhy2002.examples.lodgement.bankc.gen.node;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.bankc.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@ComponentScope
public class BankCProductNameNodeRuleProvider extends ProductNameNodeRuleProvider {

    @Inject
    public BankCProductNameNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductNameNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.NAB_PRODUCT_NAME);
        node.setRequired(true);
    }

    @Inject
    Provider<ProductNameChangedRule> productNameChangedRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        {
            ProductNameChangedRule productNameChangedRule = productNameChangedRuleProvider.get();
            createdRules.add(productNameChangedRule);
        }
    }

}
