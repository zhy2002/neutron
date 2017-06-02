package zhy2002.examples.lodgement.bankb.gen.node;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ComponentScope
public class BankBAccessContactTitleNodeRuleProvider extends AccessContactTitleNodeRuleProvider {

    @Inject
    public BankBAccessContactTitleNodeRuleProvider() {
    }

    @Override
    public void initializeState(AccessContactTitleNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.TITLE_TYPE);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
