package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;

@Module(subcomponents = {
    UsernameNodeComponent.class,
    EmailNodeComponent.class,
    PasswordNodeComponent.class,
    RepeatPasswordNodeComponent.class,
    AgeNodeComponent.class,
    PlanNodeComponent.class,
    ReceiveOffersNodeComponent.class,
    OwnInvestmentPropertyNodeComponent.class,
    PropertyAddressNodeComponent.class,
    PropertyStateNodeComponent.class,
    PropertyDetailsNodeComponent.class,
    CountryCodeNodeComponent.class,
    AreaCodeNodeComponent.class,
    PhoneNumberNodeComponent.class,
    PhoneInfoNodeComponent.class,
    ErrorNodeComponent.class,
    ErrorListNodeComponent.class,
    RegisterNodeComponent.class
})
public class ManifestModule {
}