package zhy2002.neutron.data;


import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface NodeIdentity {

    String getLocalId();

    String getName();

    NodeIdentityMap getNodeIdentityMap();
}
