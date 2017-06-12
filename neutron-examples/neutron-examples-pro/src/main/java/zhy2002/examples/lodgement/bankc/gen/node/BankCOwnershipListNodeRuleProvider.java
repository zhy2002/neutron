package zhy2002.examples.lodgement.bankc.gen.node;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.bankc.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;



public class BankCOwnershipListNodeRuleProvider extends OwnershipListNodeRuleProvider {

    @Inject
    public BankCOwnershipListNodeRuleProvider() {
    }

    @Override
    public void initializeState(OwnershipListNode<?> node) {
        super.initializeState(node);

    }

    @Inject
    Provider<OwnershipRequiredValidationRule> ownershipRequiredValidationRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        OwnershipRequiredValidationRule ownershipRequiredValidationRule = ownershipRequiredValidationRuleProvider.get();
        createdRules.add(ownershipRequiredValidationRule);
    }

}
