package zhy2002.neutron.core.node;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.core.LeafUiNode;
import zhy2002.neutron.core.ParentUiNode;
import zhy2002.neutron.core.config.MetadataRegistry;
import zhy2002.neutron.core.config.PropertyMetadata;
import zhy2002.neutron.core.data.BooleanOption;
import zhy2002.neutron.core.data.NodeIdentity;

import javax.validation.constraints.NotNull;
import java.util.Arrays;

public abstract class BooleanUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, Boolean> {

    protected BooleanUiNode(@NotNull P parent) {
        super(parent);
    }

    @Override
    public Class<Boolean> getValueClass() {
        return Boolean.class;
    }

    @Override
    public PropertyMetadata<Boolean> getValuePropertyMetadata() {
        return VALUE_PROPERTY;
    }

    //region node properties

    public static final PropertyMetadata<Boolean> VALUE_PROPERTY = MetadataRegistry.createProperty(BooleanUiNode.class, "value", Boolean.class);
    public static final PropertyMetadata<Boolean> FIXED_VALUE_PROPERTY = MetadataRegistry.createProperty(BooleanUiNode.class, "fixedValue", Boolean.class);

    @JsMethod
    @Override
    public Boolean getValue() {
        return getStateValue(VALUE_PROPERTY);
    }

    @JsMethod
    @Override
    public void setValue(Boolean value) {
        setStateValue(VALUE_PROPERTY, value);
    }

    @Override
    protected void clearNodeIdentity() {
        NodeIdentity nodeIdentity = getNodeIdentity();
        if (nodeIdentity != null) {
            setValue(nodeIdentity.getValue());
        }

        super.clearNodeIdentity();
    }

    public Boolean getFixedValue() {
        return getStateValue(FIXED_VALUE_PROPERTY);
    }

    public void setFixedValue(Boolean fixedValue) {
        setStateValue(FIXED_VALUE_PROPERTY, fixedValue);
    }

    @SuppressWarnings("unusable-by-js")
    @JsMethod
    public BooleanOption[] getOptions() {
        BooleanOption[] options = (BooleanOption[]) getStateValue(OPTIONS_PROPERTY);
        BooleanOption[] result = null;
        if (options != null) {
            result = Arrays.copyOf(options, options.length);
        }
        return result;
    }

    @SuppressWarnings("unusable-by-js")
    @JsMethod
    public void setOptions(BooleanOption[] value) {
        setStateValue(OPTIONS_PROPERTY, value);
    }

    //endregion
}
