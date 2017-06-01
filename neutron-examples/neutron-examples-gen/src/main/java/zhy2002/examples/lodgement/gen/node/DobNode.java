package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.examples.lodgement.gen.rule.*;

public abstract class DobNode<P extends ParentUiNode<?>> extends StringUiNode<P> {

    public static final PropertyMetadata<Integer> MIN_AGE_PROPERTY = MetadataRegistry.createProperty(DobNode.class, "minAge", Integer.class);
    public static final PropertyMetadata<Integer> MAX_AGE_PROPERTY = MetadataRegistry.createProperty(DobNode.class, "maxAge", Integer.class);
    public DobNode(P parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public Integer getMinAge() {
        return getStateValue(MIN_AGE_PROPERTY);
    }

    @JsMethod
    public void setMinAge(Integer value) {
        setStateValue(MIN_AGE_PROPERTY, value);
    }


    @JsMethod
    public Integer getMaxAge() {
        return getStateValue(MAX_AGE_PROPERTY);
    }

    @JsMethod
    public void setMaxAge(Integer value) {
        setStateValue(MAX_AGE_PROPERTY, value);
    }

}
