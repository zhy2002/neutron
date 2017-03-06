package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


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

    private AreaCodeNodeRuleProvider getRuleProvider() {
        return component.getAreaCodeNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public AreaCodeNode(@NotNull PhoneInfoNode parent, String name) {
        super(parent, name);
    }

}
