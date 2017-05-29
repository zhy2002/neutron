package zhy2002.examples.lodgement.bankc.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@AccessTelephoneNodeScope
public class BankCAccessTelephoneNodeRuleProvider extends AccessTelephoneNodeRuleProvider {

    @Inject
    public BankCAccessTelephoneNodeRuleProvider() {
    }

    @Override
    public void initializeState(AccessTelephoneNode node) {
        super.initializeState(node);

        node.setCountryCodeReadonly(Boolean.TRUE);
        node.setValue(ApplicationNodeConstants.AUS_DEFAULT);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
