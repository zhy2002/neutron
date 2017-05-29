package zhy2002.examples.lodgement.cba.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;



public class CbaYesNoOptionNodeRuleProvider extends YesNoOptionNodeRuleProvider {

    @Inject
    public CbaYesNoOptionNodeRuleProvider() {
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
