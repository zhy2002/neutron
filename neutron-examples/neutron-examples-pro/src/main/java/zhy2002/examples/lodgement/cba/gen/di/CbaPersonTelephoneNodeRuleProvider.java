package zhy2002.examples.lodgement.cba.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@PersonTelephoneNodeScope
public class CbaPersonTelephoneNodeRuleProvider extends PersonTelephoneNodeRuleProvider {

    @Inject
    public CbaPersonTelephoneNodeRuleProvider() {
    }

    @Override
    public void initializeState(PersonTelephoneNode node) {
        super.initializeState(node);

        node.setEmptyValue(new Telephone("+61"));
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
