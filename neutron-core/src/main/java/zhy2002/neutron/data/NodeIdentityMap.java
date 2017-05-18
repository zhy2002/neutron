package zhy2002.neutron.data;

import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface NodeIdentityMap {
    NodeIdentity get(String childName);

    NodeIdentity next();
}
