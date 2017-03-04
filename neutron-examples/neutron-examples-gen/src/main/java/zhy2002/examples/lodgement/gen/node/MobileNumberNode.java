package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class MobileNumberNode extends StringUiNode<BaseContactNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return MobileNumberNode.class;
    }

    private MobileNumberNodeComponent component;

    @Inject
    void createComponent(MobileNumberNodeComponent.Builder builder) {
        this.component = builder.setMobileNumberNodeModule(new MobileNumberNodeModule(this)).build();
    }

    @Override
    protected MobileNumberNodeRuleProvider getRuleProvider() {
        return component.getMobileNumberNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public MobileNumberNode(@NotNull BaseContactNode<?> parent, String name) {
        super(parent, name);
    }

}
