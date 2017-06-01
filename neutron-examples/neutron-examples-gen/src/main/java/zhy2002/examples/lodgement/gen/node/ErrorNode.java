package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ErrorNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ErrorNode extends ValidationErrorUiNode<ErrorListNode> {

    @Inject
    public ErrorNode(@Owner ErrorListNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ErrorNode.class;
    }

    protected final ErrorNodeComponent getComponent() {
        return component;
    }


    private ErrorNodeComponent component;

    @Inject
    void createComponent(ErrorNodeComponent.Builder builder) {
        this.component = builder.setErrorNodeModule(new ErrorNodeModule(this)).build();
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
