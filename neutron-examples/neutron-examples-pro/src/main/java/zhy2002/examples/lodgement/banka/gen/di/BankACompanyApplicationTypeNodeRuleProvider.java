package zhy2002.examples.lodgement.banka.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@CompanyApplicationTypeNodeScope
public class BankACompanyApplicationTypeNodeRuleProvider extends CompanyApplicationTypeNodeRuleProvider {

    @Inject
    public BankACompanyApplicationTypeNodeRuleProvider() {
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
