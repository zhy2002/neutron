package zhy2002.examples.lodgement.bankb.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;



public class BankBYesNoOptionNodeRuleProvider extends YesNoOptionNodeRuleProvider {

    @Inject
    public BankBYesNoOptionNodeRuleProvider() {
    }

    @Override
    public void initializeState(YesNoOptionNode<?> node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.YES_NO_TYPE);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
