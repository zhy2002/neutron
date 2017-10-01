package zhy2002.neutron.model;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrameworkNodes {
    /**
     * This needs to be kept in sync with the Neutron framework.
     * todo construct this map with reflection.
     */
    static final Map<String, NodeInfo> FRAMEWORK_NODE_MAP = new HashMap<>();
    static final NodeInfo UI_NODE_INFO;
    static final NodeInfo PARENT_NODE_INFO;
    static final NodeInfo OBJECT_NODE_INFO;
    static final NodeInfo LIST_NODE_INFO;
    static final NodeInfo LEAF_NODE_INFO;
    static final NodeInfo ROOT_NODE_INFO;
    static final NodeInfo GENERIC_NODE_INFO;
    static final NodeInfo VOID_NODE_INFO;

    static {
        UI_NODE_INFO = new NodeInfo();
        UI_NODE_INFO.setTypeName("UiNode");
        UI_NODE_INFO.setGenericTypeName("UiNode<?>");
        UI_NODE_INFO.setParentBaseTypeName("ParentUiNode<?>");
        UI_NODE_INFO.setAbstractNode(true);
        UI_NODE_INFO.getBaseTypes().add(UI_NODE_INFO);
        FRAMEWORK_NODE_MAP.put(UI_NODE_INFO.getTypeName(), UI_NODE_INFO);

        PARENT_NODE_INFO = new NodeInfo();
        PARENT_NODE_INFO.setTypeName("ParentUiNode");
        PARENT_NODE_INFO.setGenericTypeName("ParentUiNode<?>");
        PARENT_NODE_INFO.setParentBaseTypeName("ParentUiNode<?>");
        PARENT_NODE_INFO.setBaseType(UI_NODE_INFO);
        PARENT_NODE_INFO.setAbstractNode(true);
        PARENT_NODE_INFO.getBaseTypes().addAll(Arrays.asList(PARENT_NODE_INFO, UI_NODE_INFO));
        FRAMEWORK_NODE_MAP.put(PARENT_NODE_INFO.getTypeName(), PARENT_NODE_INFO);

        OBJECT_NODE_INFO = new NodeInfo();
        OBJECT_NODE_INFO.setTypeName("ObjectUiNode");
        OBJECT_NODE_INFO.setGenericTypeName("ObjectUiNode<?>");
        OBJECT_NODE_INFO.setParentBaseTypeName("ParentUiNode<?>");
        OBJECT_NODE_INFO.setBaseType(PARENT_NODE_INFO);
        OBJECT_NODE_INFO.setAbstractNode(true);
        OBJECT_NODE_INFO.getBaseTypes().addAll(Arrays.asList(OBJECT_NODE_INFO, PARENT_NODE_INFO, UI_NODE_INFO));
        FRAMEWORK_NODE_MAP.put(OBJECT_NODE_INFO.getTypeName(), OBJECT_NODE_INFO);

        LIST_NODE_INFO = new NodeInfo();
        LIST_NODE_INFO.setTypeName("ListUiNode");
        LIST_NODE_INFO.setGenericTypeName("ListUiNode<?,?>");
        LIST_NODE_INFO.setParentBaseTypeName("ObjectUiNode<?>");
        LIST_NODE_INFO.setBaseType(PARENT_NODE_INFO);
        LIST_NODE_INFO.setAbstractNode(true);
        LIST_NODE_INFO.getBaseTypes().addAll(Arrays.asList(LIST_NODE_INFO, PARENT_NODE_INFO, UI_NODE_INFO));
        FRAMEWORK_NODE_MAP.put(LIST_NODE_INFO.getTypeName(), LIST_NODE_INFO);

        ROOT_NODE_INFO = new NodeInfo();
        ROOT_NODE_INFO.setTypeName("RootUiNode");
        ROOT_NODE_INFO.setGenericTypeName("RootUiNode<?>");
        ROOT_NODE_INFO.setParentBaseTypeName("ObjectUiNode<?>");
        ROOT_NODE_INFO.setBaseType(OBJECT_NODE_INFO);
        ROOT_NODE_INFO.setAbstractNode(true);
        ROOT_NODE_INFO.getBaseTypes().addAll(Arrays.asList(ROOT_NODE_INFO, OBJECT_NODE_INFO, PARENT_NODE_INFO, UI_NODE_INFO));
        FRAMEWORK_NODE_MAP.put(ROOT_NODE_INFO.getTypeName(), ROOT_NODE_INFO);

        LEAF_NODE_INFO = new NodeInfo();
        LEAF_NODE_INFO.setTypeName("LeafUiNode");
        LEAF_NODE_INFO.setGenericTypeName("LeafUiNode<?,?>");
        LEAF_NODE_INFO.setParentBaseTypeName("ParentUiNode<?>");
        LEAF_NODE_INFO.setBaseType(UI_NODE_INFO);
        LEAF_NODE_INFO.setAbstractNode(true);
        LEAF_NODE_INFO.getBaseTypes().addAll(Arrays.asList(LEAF_NODE_INFO, UI_NODE_INFO));
        FRAMEWORK_NODE_MAP.put(LEAF_NODE_INFO.getTypeName(), LEAF_NODE_INFO);

        GENERIC_NODE_INFO = new NodeInfo();
        GENERIC_NODE_INFO.setTypeName("P");
        GENERIC_NODE_INFO.setGenericTypeName("P");
        FRAMEWORK_NODE_MAP.put(GENERIC_NODE_INFO.getTypeName(), GENERIC_NODE_INFO);

        VOID_NODE_INFO = new NodeInfo();
        VOID_NODE_INFO.setTypeName("VoidUiNode");
        VOID_NODE_INFO.setGenericTypeName("VoidUiNode");
        FRAMEWORK_NODE_MAP.put(VOID_NODE_INFO.getTypeName(), VOID_NODE_INFO);

        for (String subLeafTypeName : Arrays.asList("BooleanUiNode", "DoubleUiNode", "BigDecimalUiNode", "ReferenceUiNode", "StringUiNode", "AnyUiNode", "ValidationErrorUiNode")) {
            NodeInfo subLeafNodeInfo = new NodeInfo();
            subLeafNodeInfo.setTypeName(subLeafTypeName);
            subLeafNodeInfo.setGenericTypeName(subLeafTypeName + "<?>");
            subLeafNodeInfo.setParentBaseTypeName("ParentUiNode<?>");
            subLeafNodeInfo.setBaseType(LEAF_NODE_INFO);
            subLeafNodeInfo.setAbstractNode(true);
            subLeafNodeInfo.getBaseTypes().addAll(Arrays.asList(subLeafNodeInfo, LEAF_NODE_INFO, UI_NODE_INFO));
            FRAMEWORK_NODE_MAP.put(subLeafNodeInfo.getTypeName(), subLeafNodeInfo);
        }
    }

}
