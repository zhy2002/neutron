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
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.bankc.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@ComponentScope
public class BankCProductNodeRuleProvider extends ProductNodeRuleProvider {

    @Inject
    public BankCProductNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductNode node) {
        super.initializeState(node);

        node.setSelectedName("productDescriptionNode");
    }

    @Inject
    Provider<UpdateProductNodeLabelRule> updateProductNodeLabelRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UpdateProductNodeLabelRule updateProductNodeLabelRule = updateProductNodeLabelRuleProvider.get();
        createdRules.add(updateProductNodeLabelRule);
    }

}
