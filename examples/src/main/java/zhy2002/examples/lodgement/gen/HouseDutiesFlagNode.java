package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class HouseDutiesFlagNode extends YesNoOptionNode<UnemployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return HouseDutiesFlagNode.class;
    }

    private HouseDutiesFlagNodeComponent component;

    @Inject
    void createComponent(HouseDutiesFlagNodeComponent.Builder builder) {
        this.component = builder.setHouseDutiesFlagNodeModule(new HouseDutiesFlagNodeModule(this)).build();
    }

    @Override
    protected HouseDutiesFlagNodeRuleProvider getRuleProvider() {
        return component.getHouseDutiesFlagNodeRuleProvider();
    }

    public HouseDutiesFlagNode(UnemployedNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
