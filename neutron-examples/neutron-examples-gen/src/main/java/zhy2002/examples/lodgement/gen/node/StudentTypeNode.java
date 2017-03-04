package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class StudentTypeNode extends StringUiNode<UnemployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return StudentTypeNode.class;
    }

    private StudentTypeNodeComponent component;

    @Inject
    void createComponent(StudentTypeNodeComponent.Builder builder) {
        this.component = builder.setStudentTypeNodeModule(new StudentTypeNodeModule(this)).build();
    }

    @Override
    protected StudentTypeNodeRuleProvider getRuleProvider() {
        return component.getStudentTypeNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public StudentTypeNode(@NotNull UnemployedNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setOptions(ApplicationNodeConstants.STUDENT_TYPE.toArray());
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
