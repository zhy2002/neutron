package zhy2002.examples.lodgement.cba.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@CompanyRegistrationStateNodeScope
public class CbaCompanyRegistrationStateNodeRuleProvider extends CompanyRegistrationStateNodeRuleProvider {

    @Inject
    public CbaCompanyRegistrationStateNodeRuleProvider() {
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
