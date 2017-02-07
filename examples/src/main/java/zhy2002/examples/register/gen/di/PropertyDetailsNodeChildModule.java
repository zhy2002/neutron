package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;

@Module(subcomponents = {
})
@PropertyDetailsNodeChildScope
public class PropertyDetailsNodeChildModule {


    @Provides
    @PropertyDetailsNodeChildScope
    @Named("propertyAddressNode")
    PropertyAddressNode providePropertyAddressNode(
        PropertyDetailsNode parent,
        MembersInjector<PropertyAddressNode> injector
    ) {
        PropertyAddressNode node = new PropertyAddressNode(parent, "propertyAddressNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PropertyDetailsNodeChildScope
    @Named("propertyStateNode")
    PropertyStateNode providePropertyStateNode(
        PropertyDetailsNode parent,
        MembersInjector<PropertyStateNode> injector
    ) {
        PropertyStateNode node = new PropertyStateNode(parent, "propertyStateNode");

        injector.injectMembers(node);
        return node;
    }

}