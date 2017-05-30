package zhy2002.examples.lodgement.bankb.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.bankb.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@CurrentEmploymentListNodeScope
public class BankBCurrentEmploymentListNodeRuleProvider extends CurrentEmploymentListNodeRuleProvider {

    @Inject
    public BankBCurrentEmploymentListNodeRuleProvider() {
    }

    @Override
    public void initializeState(CurrentEmploymentListNode node) {
        super.initializeState(node);

        node.setNodeLabel("Current Employment");
        node.setMinItemCount(1);
    }

    @Inject
    Provider<MinItemCountValidationRule> minItemCountValidationRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        MinItemCountValidationRule minItemCountValidationRule = minItemCountValidationRuleProvider.get();
        createdRules.add(minItemCountValidationRule);
    }

}
