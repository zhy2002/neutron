package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;

@PropertyDetailsNodeChildScope
@Subcomponent(modules = {PropertyDetailsNodeChildModule.class})
public interface PropertyDetailsNodeChildComponent {

    PropertyAddressNode providePropertyAddressNode(@Named("propertyAddressNode") PropertyAddressNode impl);
    PropertyStateNode providePropertyStateNode(@Named("propertyStateNode") PropertyStateNode impl);

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyDetailsNodeChildModule(PropertyDetailsNodeChildModule module);

        PropertyDetailsNodeChildComponent build();
    }
}
