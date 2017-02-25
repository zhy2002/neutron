package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;

public class AreaCodeNode extends PhoneInfoFieldNode {

    @Override
    public final Class<?> getConcreteClass() {
        return AreaCodeNode.class;
    }

    private AreaCodeNodeComponent component;

    @Inject
    void createComponent(AreaCodeNodeComponent.Builder builder) {
        this.component = builder.setAreaCodeNodeModule(new AreaCodeNodeModule(this)).build();
    }

    @Override
    protected AreaCodeNodeRuleProvider getRuleProvider() {
        return component.getAreaCodeNodeRuleProvider();
    }

    public AreaCodeNode(PhoneInfoNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequiredMessage("Area code is required.");
    }

}
