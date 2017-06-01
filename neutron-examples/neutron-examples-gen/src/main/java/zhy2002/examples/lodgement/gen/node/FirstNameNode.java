package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.FirstNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class FirstNameNode extends StringUiNode<PersonGeneralNode> {

    @Inject
    public FirstNameNode(@Owner PersonGeneralNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return FirstNameNode.class;
    }

    protected final FirstNameNodeComponent getComponent() {
        return component;
    }


    private FirstNameNodeComponent component;

    @Inject
    void createComponent(FirstNameNodeComponent.Builder builder) {
        this.component = builder.setFirstNameNodeModule(new FirstNameNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
