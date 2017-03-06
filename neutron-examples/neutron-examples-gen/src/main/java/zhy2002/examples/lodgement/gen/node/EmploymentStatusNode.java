package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class EmploymentStatusNode extends StringUiNode<EmployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return EmploymentStatusNode.class;
    }

    private EmploymentStatusNodeComponent component;

    @Inject
    void createComponent(EmploymentStatusNodeComponent.Builder builder) {
        this.component = builder.setEmploymentStatusNodeModule(new EmploymentStatusNodeModule(this)).build();
    }

    private EmploymentStatusNodeRuleProvider getRuleProvider() {
        return component.getEmploymentStatusNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public EmploymentStatusNode(@NotNull EmployedNode parent, String name) {
        super(parent, name);
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
