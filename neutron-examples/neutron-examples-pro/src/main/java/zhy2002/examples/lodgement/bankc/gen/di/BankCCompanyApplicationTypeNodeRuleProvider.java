package zhy2002.examples.lodgement.bankc.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@CompanyApplicationTypeNodeScope
public class BankCCompanyApplicationTypeNodeRuleProvider extends CompanyApplicationTypeNodeRuleProvider {

    @Inject
    public BankCCompanyApplicationTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyApplicationTypeNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.COMPANY_APPLICATION_TYPE);
        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
