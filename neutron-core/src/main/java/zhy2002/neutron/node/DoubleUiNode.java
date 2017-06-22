package zhy2002.neutron.node;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.LeafUiNode;
import zhy2002.neutron.ParentUiNode;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.neutron.data.DoubleOption;
import zhy2002.neutron.data.NodeIdentity;

import javax.validation.constraints.NotNull;
import java.util.Arrays;

public abstract class DoubleUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, Double> {

    protected DoubleUiNode(@NotNull P parent) {
        super(parent);
    }

    @Override
    public Class<Double> getValueClass() {
        return Double.class;
    }

    @Override
    public PropertyMetadata<Double> getValuePropertyMetadata() {
        return VALUE_PROPERTY;
    }

    //region node properties

    public static final PropertyMetadata<Double> VALUE_PROPERTY = MetadataRegistry.createProperty(DoubleUiNode.class, "value", Double.class);

    @JsMethod
    @Override
    public Double getValue() {
        return getStateValue(VALUE_PROPERTY);
    }

    @JsMethod
    @Override
    public void setValue(Double value) {
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


    @JsMethod
    public DoubleOption[] getOptions() {
        DoubleOption[] options = (DoubleOption[]) getStateValue(OPTIONS_PROPERTY);
        DoubleOption[] result = null;
        if (options != null) {
            result = Arrays.copyOf(options, options.length);
        }
        return result;
    }

    @JsMethod
    public void setOptions(DoubleOption[] value) {
        setStateValue(OPTIONS_PROPERTY, value);
    }

    //endregion
}
