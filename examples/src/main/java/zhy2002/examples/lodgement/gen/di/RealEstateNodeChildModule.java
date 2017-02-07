package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
    UsageNodeChildComponent.class,
    PropertyNodeChildComponent.class,
    AccessNodeChildComponent.class
})
@RealEstateNodeChildScope
public class RealEstateNodeChildModule {

    private final RealEstateNode parent;

    public RealEstateNodeChildModule(RealEstateNode parent) {
        this.parent = parent;
    }


    @Provides
    @RealEstateNodeChildScope
    @Named("usageNode")
    UsageNode provideUsageNode(
        MembersInjector<UsageNode> injector
    ) {
        UsageNode node = new UsageNode(parent, "usageNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @RealEstateNodeChildScope
    @Named("propertyNode")
    PropertyNode providePropertyNode(
        MembersInjector<PropertyNode> injector
    ) {
        PropertyNode node = new PropertyNode(parent, "propertyNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @RealEstateNodeChildScope
    @Named("accessNode")
    AccessNode provideAccessNode(
        MembersInjector<AccessNode> injector
    ) {
        AccessNode node = new AccessNode(parent, "accessNode");

        injector.injectMembers(node);
        return node;
    }

}