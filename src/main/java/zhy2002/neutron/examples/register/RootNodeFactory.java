package zhy2002.neutron.examples.register;

import zhy2002.neutron.UiNodeContext;

public class RootNodeFactory {

    private PasswordNodeFactory passwordNodeFactory = new PasswordNodeFactory();
    private ErrorListNodeFactory errorListNodeFactory = new ErrorListNodeFactory();

    public RootNode create(UiNodeContext context) {
        RootNode root = new RootNode(context);

        PasswordNode passwordNode = passwordNodeFactory.create(root, "password");
        root.setPasswordNode(passwordNode);

        ErrorListNode errorListNode = errorListNodeFactory.create(root, "errorList");
        root.setErrorList(errorListNode);

        return root;
    }


}
