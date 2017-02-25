package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class ApplicationTypeNode extends StringUiNode<PersonGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ApplicationTypeNode.class;
    }

    private ApplicationTypeNodeComponent component;

    @Inject
    void createComponent(ApplicationTypeNodeComponent.Builder builder) {
        this.component = builder.setApplicationTypeNodeModule(new ApplicationTypeNodeModule(this)).build();
    }

    @Override
    protected ApplicationTypeNodeRuleProvider getRuleProvider() {
        return component.getApplicationTypeNodeRuleProvider();
    }

    public ApplicationTypeNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setOptions(ApplicationNodeConstants.APPLICATION_TYPE.toArray());
        setRequired(true);
    }

    @JsMethod
    public Object getOptions() {
        return getStateValue(ApplicationNodeConstants.OPTIONS);
    }

    @JsMethod
    public void setOptions(Object value) {
        setStateValue(ApplicationNodeConstants.OPTIONS, Object.class, value);
    }

}
