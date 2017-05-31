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



public class BankCBaseMobileNumberNodeRuleProvider extends BaseMobileNumberNodeRuleProvider {

    @Inject
    public BankCBaseMobileNumberNodeRuleProvider() {
    }

    @Override
    public void initializeState(BaseMobileNumberNode<?> node) {
        super.initializeState(node);

        node.setPattern("^(\\+\\d{1,3}[- ]?)?\\d{10}$");
        node.setPatternMessage("Invalid mobile number.");
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
