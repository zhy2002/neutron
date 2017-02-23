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

public class ApplicantTypeNode extends StringUiNode<PersonGeneralNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return ApplicantTypeNode.class;
    }

    private ApplicantTypeNodeComponent component;

    @Inject
    void createComponent(ApplicantTypeNodeComponent.Builder builder) {
        this.component = builder.setApplicantTypeNodeModule(new ApplicantTypeNodeModule(this)).build();
    }

    @Override
    protected ApplicantTypeNodeRuleProvider getRuleProvider() {
        return component.getApplicantTypeNodeRuleProvider();
    }

    public ApplicantTypeNode(PersonGeneralNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setOptions(ApplicationNodeConstants.APPLICANT_TYPE.toArray());
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
