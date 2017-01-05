package zhy2002.neutron;

import java.util.*;

class DomainDescription {

    private static final String TARGET_PACKAGE = "targetPackage";
    private static final String PARENT_TYPE_NAME = "parentTypeName"; //this is set if parent type needs to be passed as a generic parameter to the super type.
    private static final String CONTEXT_NAME = "contextName";
    private static final String TYPE_NAME = "typeName";
    private static final String CAN_LOAD = "canLoad";
    private static final String IS_ABSTRACT = "isAbstract";
    private static final String PARENT_BASE_TYPE_NAME = "parentBaseTypeName";

    private String targetPackage;
    private String contextName;
    private final List<Map<String, Object>> nodeList = new ArrayList<>();
    private final List<Map<String, Object>> ruleList = new ArrayList<>();
    private final Map<String, Object> registryDescription = new HashMap<>();

    Map<String, Object> getRegistryDescription() {
        return registryDescription;
    }

    List<Map<String, Object>> getNodeList() {
        return nodeList;
    }

    List<Map<String, Object>> getRuleList() {
        return ruleList;
    }

    @SuppressWarnings("unchecked")
    void load(Map<String, Object> desc) {
        targetPackage = (String) desc.get(TARGET_PACKAGE);
        Map<String, Object> rootType = (Map<String, Object>) desc.get("rootType");
        contextName = (String) rootType.get(TYPE_NAME);
        registryDescription.put(TARGET_PACKAGE, targetPackage);
        registryDescription.put(CONTEXT_NAME, contextName);
        registryDescription.put(TYPE_NAME, contextName);
        rootType.put(PARENT_TYPE_NAME, "VoidUiNode");
        rootType.put(CAN_LOAD, true);

        loadNode(rootType);

        List<Map<String, Object>> commonTypes = (List<Map<String, Object>>) desc.get("commonTypes");
        if (commonTypes != null) {
            for (Map<String, Object> nodeType : commonTypes) {
                String parentBaseTypeName = (String) nodeType.get(PARENT_BASE_TYPE_NAME);
                if(Boolean.TRUE.equals(nodeType.get(IS_ABSTRACT))) {
                    nodeType.put(PARENT_TYPE_NAME, "P");
                    nodeType.put("parent", Collections.singletonMap(TYPE_NAME, "P"));
                } else {
                    nodeType.put(PARENT_TYPE_NAME, parentBaseTypeName);
                    nodeType.put("parent", Collections.singletonMap(TYPE_NAME, parentBaseTypeName));
                }


                loadNode(nodeType);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private void loadNode(Map<String, Object> node) {
        node.put(TARGET_PACKAGE, targetPackage);
        node.put(CONTEXT_NAME, contextName);
        node.putIfAbsent(IS_ABSTRACT, false);
        node.putIfAbsent(CAN_LOAD, false);

        if (node.get("baseTypeName") == null) {
            if (node.get("itemTypeName") != null) {
                node.put("baseTypeName", "ListUiNode");
            } else if (node.get("children") != null) {
                node.put("baseTypeName", "ObjectUiNode");
            } else if (node.get("valueTypeName") != null) {
                node.put("baseTypeName", "LeafUiNode");
            }
        }

        List<Map<String, Object>> children = (List<Map<String, Object>>) node.get("children");
        if (children != null) {
            for (Map<String, Object> child : children) {
                child.computeIfAbsent("name", name -> CodeGenUtil.firstCharLower((String) child.get(TYPE_NAME)));
            }
        }

        List<Map<String, Object>> childTypes = (List<Map<String, Object>>) node.get("childTypes");
        if (childTypes != null) {
            for (Map<String, Object> childNode : childTypes) {
                childNode.put("parent", node);
                String baseTypeName = (String) childNode.get("baseTypeName");
                if (!isDefinedInParent(baseTypeName, node)) {
                    String typeName = (String)node.get(TYPE_NAME);
                    if(Boolean.TRUE.equals(node.get(IS_ABSTRACT)) && node.get(PARENT_BASE_TYPE_NAME) != null) {
                        typeName += "<?>";
                    }
                    childNode.put(PARENT_TYPE_NAME, typeName);
                }
                loadNode(childNode);
            }
        }

        List<Map<String, Object>> properties = (List<Map<String, Object>>) node.get("properties");
        if (properties != null) {
            for (Map<String, Object> prop : properties) {
                prop.put("nameAllCaps", CodeGenUtil.allCaps((String) prop.get("name")));
                if ("int".equals(prop.get("externalTypeName"))) {
                    prop.put(TYPE_NAME, "Integer");
                }

                prop.computeIfAbsent("externalTypeName", externalTypeName -> prop.get(TYPE_NAME));
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

                String typeName = (String) node.get(TYPE_NAME);
                if(Boolean.TRUE.equals(node.get(IS_ABSTRACT)) && node.get(PARENT_BASE_TYPE_NAME) != null) {
                    typeName += "<?>";
                }
                rule.put(PARENT_TYPE_NAME, typeName);
                rule.put("ownerTypeName", node.get(TYPE_NAME));
                rule.put(TARGET_PACKAGE, targetPackage);

                ruleList.add(rule);
            }
        }

        List<Map<String, Object>> init = (List<Map<String, Object>>)node.get("init");
        if(init != null) {
            for(Map<String, Object> item : init) {
                if(item.containsKey("mode")) {
                    item.put("nameAllCaps", CodeGenUtil.allCaps((String) item.get("propertyName")));
                }
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
            if (baseTypeName.equals(childType.get(TYPE_NAME)))
                return true;
        }

        return false;
    }

}
