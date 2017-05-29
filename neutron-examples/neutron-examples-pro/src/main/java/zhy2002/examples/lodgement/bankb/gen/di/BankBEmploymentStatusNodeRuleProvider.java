package zhy2002.examples.lodgement.bankb.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@EmploymentStatusNodeScope
public class BankBEmploymentStatusNodeRuleProvider extends EmploymentStatusNodeRuleProvider {

    @Inject
    public BankBEmploymentStatusNodeRuleProvider() {
    }

    @Override
    public void initializeState(EmploymentStatusNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.EMPLOYMENT_STATUS);
        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
