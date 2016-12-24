package zhy2002.neutron.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DomainDescription {

    public static final String TARGET_PACKAGE = "targetPackage";
    public static final String PARENT_TYPE_NAME = "parentTypeName";
    public static final String CONTEXT_NAME = "contextName";
    public static final String TYPE_NAME = "typeName";
    public static final String CAN_LOAD = "canLoad";

    private List<Map<String, Object>> nodeList = new ArrayList<>();
    private List<Map<String, Object>> ruleList = new ArrayList<>();
    private String targetPackage;
    private String contextName;
    private Map<String, Object> registryDescription = new HashMap<>();


    public Map<String, Object> getRegistryDescription() {
        return registryDescription;
    }

    public List<Map<String, Object>> getNodeList() {
        return nodeList;
    }

    public List<Map<String, Object>> getRuleList() {
        return ruleList;
    }

    @SuppressWarnings("unchecked")
    public void load(Map<String, Object> root) {
        targetPackage = (String) root.get(TARGET_PACKAGE);
        Map<String, Object> rootType = (Map<String, Object>) root.get("rootType");
        contextName = (String) rootType.get(TYPE_NAME);
        registryDescription.put(TARGET_PACKAGE, targetPackage);
        registryDescription.put(CONTEXT_NAME, contextName);
        registryDescription.put(TYPE_NAME, contextName);

        rootType.put(PARENT_TYPE_NAME, "VoidUiNode");
        rootType.put(CAN_LOAD, true);
        loadNode(rootType);
    }

    @SuppressWarnings("unchecked")
    private void loadNode(Map<String, Object> node) {
        node.put(TARGET_PACKAGE, targetPackage);
        node.put(CONTEXT_NAME, contextName);
        node.putIfAbsent("isAbstract", false);
        node.putIfAbsent(CAN_LOAD, false);
        if (node.get("baseTypeName") == null) {
            if (node.get(TYPE_NAME).toString().endsWith("ListNode")) {
                node.put("baseTypeName", "ListUiNode");
            }
        }

        List<Map<String, Object>> children = (List<Map<String, Object>>) node.get("children");
        if (children != null) {
            for (Map<String, Object> child : children) {
                child.computeIfAbsent("name", k -> firstCharLower((String) child.get(TYPE_NAME)));
            }
        }

        List<Map<String, Object>> childTypes = (List<Map<String, Object>>) node.get("childTypes");
        if (childTypes != null) {
            for (Map<String, Object> childNode : childTypes) {
                childNode.put("parent", node);
                String baseTypeName = (String) childNode.get("baseTypeName");
                if (!isDefinedInParent(baseTypeName, node)) {
                    childNode.put(PARENT_TYPE_NAME, node.get(TYPE_NAME));
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
        if (valueWrappers != null) {
            for (Map<String, Object> wrapper : valueWrappers) {
                wrapper.putIfAbsent("jsIgnore", false);
                wrapper.putIfAbsent("wrap", wrapper.get("name"));
            }
        }

        List<Map<String, Object>> rules = (List<Map<String, Object>>) node.get("rules");
        if (rules != null) {
            for (Map<String, Object> rule : rules) {
                rule.putIfAbsent("baseTypeName", "UiNodeRule");
                rule.put("parentTypeName", node.get(TYPE_NAME));
                rule.put(TARGET_PACKAGE, targetPackage);
                ruleList.add(rule);
            }
        }

        nodeList.add(node);
    }

    public void addRegistryList(String key, List<Object> list) {
        registryDescription.put(key, list);
    }

    @SuppressWarnings("unchecked")
    private boolean isDefinedInParent(String baseTypeName, Map<String, Object> parent) {
        List<Map<String, Object>> childTypes = (List<Map<String, Object>>) parent.get("childTypes");
        if (childTypes == null)
            return false;

        for (Map<String, Object> childType : childTypes) {
            if (baseTypeName.equals(childType.get(TYPE_NAME)))
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
