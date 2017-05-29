package zhy2002.examples.lodgement.banka.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;



public class BankABaseMobileNumberNodeRuleProvider extends BaseMobileNumberNodeRuleProvider {

    @Inject
    public BankABaseMobileNumberNodeRuleProvider() {
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
