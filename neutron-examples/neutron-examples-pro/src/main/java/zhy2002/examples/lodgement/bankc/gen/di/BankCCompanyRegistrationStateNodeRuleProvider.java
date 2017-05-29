package zhy2002.examples.lodgement.bankc.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@CompanyRegistrationStateNodeScope
public class BankCCompanyRegistrationStateNodeRuleProvider extends CompanyRegistrationStateNodeRuleProvider {

    @Inject
    public BankCCompanyRegistrationStateNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyRegistrationStateNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.AUSTRALIAN_STATES);
        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}