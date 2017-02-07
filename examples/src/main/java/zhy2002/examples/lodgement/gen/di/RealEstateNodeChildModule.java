package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@RealEstateNodeChildScope
public class RealEstateNodeChildModule {


    @Provides
    @RealEstateNodeChildScope
    @Named("usageNode")
    UsageNode provideUsageNode(
        RealEstateNode parent,
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
        RealEstateNode parent,
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
        RealEstateNode parent,
        MembersInjector<AccessNode> injector
    ) {
        AccessNode node = new AccessNode(parent, "accessNode");

        injector.injectMembers(node);
        return node;
    }

}