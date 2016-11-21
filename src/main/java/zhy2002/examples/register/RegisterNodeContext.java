package zhy2002.examples.register;

import zhy2002.neutron.FactoryRegistry;
import zhy2002.neutron.UiNodeContextImpl;
import zhy2002.neutron.ChildNodeFactory;

/**
 * Context and Root are a pair. This whole class is generated.
 */
public class RegisterNodeContext extends UiNodeContextImpl<RegisterNode> {

    public RegisterNodeContext(FactoryRegistry factoryRegistry) {
        super(factoryRegistry);
        initializeFactoryMap();
    }

    //region default node factories

    private static class UsernameNodeFactory extends ChildNodeFactory<UsernameNode, RegisterNode> {
        @Override
        public UsernameNode create(RegisterNode parent, String name) {
            return new UsernameNode(parent, name);
        }
    }

    private static class PasswordNodeFactory extends ChildNodeFactory<PasswordNode, RegisterNode> {
        @Override
        public PasswordNode create(RegisterNode parent, String name) {
            return new PasswordNode(parent, name);
        }
    }

    private static class ErrorListNodeFactory extends ChildNodeFactory<ErrorListNode, RegisterNode> {
        @Override
        public ErrorListNode create(RegisterNode parent, String name) {
            return new ErrorListNode(parent, name);
        }
    }

    private static class ErrorNodeFactory extends ChildNodeFactory<ErrorNode, ErrorListNode> {
        @Override
        public ErrorNode create(ErrorListNode parent, String name) {
            return new ErrorNode(parent, name);
        }
    }

    private static class EmailNodeFactory extends ChildNodeFactory<EmailNode, RegisterNode> {
        @Override
        public EmailNode create(RegisterNode parent, String name) {
            return new EmailNode(parent, name);
        }
    }

    private void initializeFactoryMap() {
        setChildNodeFactory(UsernameNode.class, new UsernameNodeFactory());
        setChildNodeFactory(PasswordNode.class, new PasswordNodeFactory());
        setChildNodeFactory(ErrorListNode.class, new ErrorListNodeFactory());
        setChildNodeFactory(ErrorNode.class, new ErrorNodeFactory());
        setChildNodeFactory(EmailNode.class, new EmailNodeFactory());
    }

    //endregion

    protected RegisterNode createRootNode() {
        return new RegisterNode(this);
    }


}
