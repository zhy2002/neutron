package zhy2002.neutron.core.data;


import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface NodeIdentity {

    String getLocalId();

    String getName();

    <T> T getValue();

    NodeIdentityMap getNodeIdentityMap();
}
