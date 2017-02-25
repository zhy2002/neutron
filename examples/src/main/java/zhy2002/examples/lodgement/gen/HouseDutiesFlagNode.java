package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
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

    public HouseDutiesFlagNode(@NotNull UnemployedNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
