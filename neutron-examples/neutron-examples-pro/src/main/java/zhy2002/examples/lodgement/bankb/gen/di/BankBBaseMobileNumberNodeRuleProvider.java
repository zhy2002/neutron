package zhy2002.examples.lodgement.bankb.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;



public class BankBBaseMobileNumberNodeRuleProvider extends BaseMobileNumberNodeRuleProvider {

    @Inject
    public BankBBaseMobileNumberNodeRuleProvider() {
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
