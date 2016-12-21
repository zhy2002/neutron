package zhy2002.neutron.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DomainDescription {

    public static final String TARGET_PACKAGE = "targetPackage";
    public static final String PARENT_TYPE_NAME = "parentTypeName";

    private List<Map<String, Object>> nodeList = new ArrayList<>();
    private String targetPackage;
    private String contextName;

    public List<Map<String, Object>> getNodeList() {
        return nodeList;
    }

    @SuppressWarnings("unchecked")
    public void load(Map<String, Object> root) {
        targetPackage = (String) root.get(TARGET_PACKAGE);
        Map<String, Object> rootType = (Map<String, Object>) root.get("rootType");
        contextName = (String) root.get("typeName");

        rootType.put(PARENT_TYPE_NAME, "VoidUiNode");
        loadNode(rootType);
    }

    @SuppressWarnings("unchecked")
    private void loadNode(Map<String, Object> node) {
        node.put(TARGET_PACKAGE, targetPackage);

        List<Map<String, Object>> children = (List<Map<String, Object>>) node.get("children");
        if (children != null) {
            for (Map<String, Object> child : children) {
                child.computeIfAbsent("name", k -> firstCharLower((String) child.get("typeName")));
            }
        }

        List<Map<String, Object>> childTypes = (List<Map<String, Object>>) node.get("childTypes");
        if (childTypes != null) {
            for (Map<String, Object> childNode : childTypes) {
                childNode.put("parent", node);
                String baseTypeName = (String) childNode.get("baseTypeName");
                if (!isDefinedInParent(baseTypeName, node)) {
                    childNode.put(PARENT_TYPE_NAME, node.get("typeName"));
                }
                loadNode(childNode);
            }
        }

        List<Map<String, Object>> properties = (List<Map<String, Object>>) node.get("properties");
        if (properties != null) {
            for (Map<String, Object> prop : properties) {
                prop.put("nameAllCaps", allCaps((String) prop.get("name")));
            }
        }

        List<Map<String, Object>> valueWrappers = (List<Map<String, Object>>) node.get("valueWrappers");
        if(valueWrappers != null) {
            for(Map<String, Object> wrapper: valueWrappers) {
                wrapper.putIfAbsent("jsIgnore", false);
                wrapper.putIfAbsent("wrap", wrapper.get("name"));
            }
        }

        nodeList.add(node);
    }

    @SuppressWarnings("unchecked")
    private boolean isDefinedInParent(String baseTypeName, Map<String, Object> parent) {
        List<Map<String, Object>> childTypes = (List<Map<String, Object>>) parent.get("childTypes");
        if (childTypes == null)
            return false;

        for (Map<String, Object> childType : childTypes) {
            if (baseTypeName.equals(childType.get("typeName")))
                return true;
        }

        return false;
    }

    private static String firstCharLower(String value) {
        if (isEmpty(value))
            return value;

        return value.substring(0, 1).toLowerCase() + value.substring(1);
    }

    private static boolean isEmpty(String value) {
        return value == null || value.length() == 0;
    }

    private static String allCaps(String value) {
        if (isEmpty(value))
            return value;

        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : value.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                stringBuilder.append('_');
                stringBuilder.append(ch);
            } else {
                stringBuilder.append(Character.toUpperCase(ch));
            }
        }

        return stringBuilder.toString();
    }
}
