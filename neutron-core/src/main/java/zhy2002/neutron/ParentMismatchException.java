package zhy2002.neutron;

/**
 * Thrown when trying to add a node whose parent is another node.
 */
public class ParentMismatchException extends RuntimeException {

    public ParentMismatchException() {}

    public ParentMismatchException(ParentUiNode<?> pParentUiNode, UiNode<?> child) {
    }
}
