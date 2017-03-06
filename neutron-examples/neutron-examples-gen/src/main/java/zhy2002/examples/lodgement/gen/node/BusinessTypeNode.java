package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class BusinessTypeNode extends StringUiNode<SelfEmployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return BusinessTypeNode.class;
    }

    private BusinessTypeNodeComponent component;

    @Inject
    void createComponent(BusinessTypeNodeComponent.Builder builder) {
        this.component = builder.setBusinessTypeNodeModule(new BusinessTypeNodeModule(this)).build();
    }

    private BusinessTypeNodeRuleProvider getRuleProvider() {
        return component.getBusinessTypeNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public BusinessTypeNode(@NotNull SelfEmployedNode parent, String name) {
        super(parent, name);
    }

}
