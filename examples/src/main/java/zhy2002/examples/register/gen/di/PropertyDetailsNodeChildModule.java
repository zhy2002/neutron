package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;

@Module(subcomponents = {
})
@PropertyDetailsNodeChildScope
public class PropertyDetailsNodeChildModule {

    private final PropertyDetailsNode parent;

    public PropertyDetailsNodeChildModule(PropertyDetailsNode parent) {
        this.parent = parent;
    }


    @Provides
    @PropertyDetailsNodeChildScope
    @Named("propertyAddressNode")
    PropertyAddressNode providePropertyAddressNode(
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
        MembersInjector<PropertyStateNode> injector
    ) {
        PropertyStateNode node = new PropertyStateNode(parent, "propertyStateNode");

        injector.injectMembers(node);
        return node;
    }

}