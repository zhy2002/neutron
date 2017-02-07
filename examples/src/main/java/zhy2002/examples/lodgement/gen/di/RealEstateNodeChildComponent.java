package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@RealEstateNodeChildScope
@Subcomponent(modules = {RealEstateNodeChildModule.class})
public interface RealEstateNodeChildComponent {

    UsageNode provideUsageNode(@Named("usageNode") UsageNode impl);
    PropertyNode providePropertyNode(@Named("propertyNode") PropertyNode impl);
    AccessNode provideAccessNode(@Named("accessNode") AccessNode impl);

}
