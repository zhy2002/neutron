package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CountryNodeModule {

    private final CountryNode owner;

    public CountryNodeModule(CountryNode owner) {
        this.owner = owner;
    }

    @Provides @CountryNodeScope @Owner CountryNode provideCountryNode() {
        return owner;
    }

    @Provides @CountryNodeScope @Owner BaseCountryNode<?> provideBaseCountryNode() {
        return owner;
    }

    @Provides @CountryNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CountryNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CountryNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}