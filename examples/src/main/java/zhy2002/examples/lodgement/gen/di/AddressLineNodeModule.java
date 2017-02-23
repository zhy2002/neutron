package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class AddressLineNodeModule {

    private final AddressLineNode owner;

    public AddressLineNodeModule(AddressLineNode owner) {
        this.owner = owner;
    }

    @Provides @AddressLineNodeScope @Owner AddressLineNode provideAddressLineNode() {
        return owner;
    }

    @Provides @AddressLineNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @AddressLineNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @AddressLineNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}