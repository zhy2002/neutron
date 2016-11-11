package zhy2002.neutron.examples.register;

public class RootNodeContextFactory {

    public RootNodeContext create(/*todo config*/) {
        RootNodeContext context = new RootNodeContext();

        RootNodeFactory rootNodeFactory = new RootNodeFactory();
        RootNode root = rootNodeFactory.create(context);
        context.initialize(root);

        return context;
    }
}
