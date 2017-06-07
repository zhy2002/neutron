package zhy2002.neutron.node;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.ChangeModeEnum;
import zhy2002.neutron.LeafUiNode;
import zhy2002.neutron.ParentUiNode;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.neutron.exception.NotImplementedException;


public abstract class AnyUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, Object> {

    protected AnyUiNode(P parent) {
        super(parent);
    }

    public static final PropertyMetadata<Object> VALUE_PROPERTY = MetadataRegistry.createProperty(AnyUiNode.class, "value", Object.class);
    public static final PropertyMetadata<Object> EMPTY_VALUE_PROPERTY = MetadataRegistry.createProperty(AnyUiNode.class, "emptyValue", Object.class, new Object(), ChangeModeEnum.DIRECT);

    @JsMethod
    @Override
    public final Object getValue() {
        return super.getStateValue(VALUE_PROPERTY);
    }

    @JsMethod
    @Override
    public final void setValue(Object value) {
        super.setStateValue(VALUE_PROPERTY, value);
    }

    @Override
    public Object getCopyOfValue() {
        throw new NotImplementedException();
    }

    public void setEmptyValue(Object value) {
        super.setStateValue(EMPTY_VALUE_PROPERTY, value);
    }

    @Override
    public Object getEmptyValue() {
        return super.getStateValue(EMPTY_VALUE_PROPERTY);
    }

    @Override
    public Class<Object> getValueClass() {
        return Object.class;
    }

    @Override
    public PropertyMetadata<Object> getValuePropertyMetadata() {
        return VALUE_PROPERTY;
    }

}
