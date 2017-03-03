package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CountryCodeNodeModule {

    private final CountryCodeNode owner;

    public CountryCodeNodeModule(CountryCodeNode owner) {
        this.owner = owner;
    }

    @Provides @CountryCodeNodeScope @Owner CountryCodeNode provideCountryCodeNode() {
        return owner;
    }

    @Provides @CountryCodeNodeScope @Owner PhoneInfoFieldNode providePhoneInfoFieldNode() {
        return owner;
    }

    @Provides @CountryCodeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CountryCodeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CountryCodeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}