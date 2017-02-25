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

public class OccupationNode extends BaseOccupationNode<EmployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OccupationNode.class;
    }

    private OccupationNodeComponent component;

    @Inject
    void createComponent(OccupationNodeComponent.Builder builder) {
        this.component = builder.setOccupationNodeModule(new OccupationNodeModule(this)).build();
    }

    @Override
    protected OccupationNodeRuleProvider getRuleProvider() {
        return component.getOccupationNodeRuleProvider();
    }

    public OccupationNode(EmployedNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
